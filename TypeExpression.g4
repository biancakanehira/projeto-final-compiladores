grammar TypeExpression;

@header{
	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	
}

@members{
	private SymbolTable symbolTable = new SymbolTable();
	private DataType currentType;
	private AbstractExpression expression;
	private char operator;
	private DataType leftDT;
	private DataType rightDT;
	private String   idAtribuido;
	private String   text;
	private Program  program = new Program();
	private Stack<List<AbstractCommand>> stack = new Stack<List<AbstractCommand>>();
	
	public void init(){
		program.setSymbolTable(symbolTable);
		stack.push(new ArrayList<AbstractCommand>());
	}
	
	public void verificaID(String idAtribuido) {
		Identifier id = symbolTable.get(idAtribuido);
		if (id == null){
			throw new RuntimeException("Semantic ERROR - Undeclared Identifier " + idAtribuido);
		}
	}
		
	public void exibirID(){
		symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
	}
	
	public void generateObjectCode(){
		program.generateTarget();
	}
	
	public void runInterpreter(){
		program.run();
	}
}

programa  : 'programa' decl+ cmd+ 'fimprog.'
			{
				program.setComandos(stack.pop());
			}
		  ;
		  
decl	  : tipo lista_var PF
		  ;
		 
tipo	  : 'INTEGER' { currentType = DataType.INTEGER; }
          | 'REAL'    { currentType = DataType.REAL; }
          ;
         
lista_var : ID {
			  if (!symbolTable.exists(_input.LT(-1).getText())) {
			  	symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType));
			  } else {
			    throw new RuntimeException("Symbol " + _input.LT(-1).getText() + " already declared");
			  }
 		   } 
           (VIRG 
           	ID {
			  if (!symbolTable.exists(_input.LT(-1).getText())) {
			  	symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType));
			  } else {
			    throw new RuntimeException("Symbol " + _input.LT(-1).getText() + " already declared");
			  }
 		   } 
           )*
   		  ;
   		  
cmd		  : cmdAttr | cmdRead | cmdWrite | cmdIf | cmdWhile
		  ;
		  
cmdIf     : 'se' {
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();				
				CmdIf _cmdIf = new CmdIf();
			}
			AP expr {
				_relExpr.setLeftSide(expression);
			}
			OPREL {
				_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
			} 
			expr {
				_relExpr.setRightSide(expression);
				_cmdIf.setExpr(_relExpr);
				
			} FP 'entao'  cmd+  
			{
				_cmdIf.setListaTrue(stack.pop());
				stack.push(new ArrayList<AbstractCommand>());
					
			}
			('senao' cmd+)? 
			
			'fimse' PF {
				_cmdIf.setListaFalse(stack.pop());
				stack.peek().add(_cmdIf);
			}		 
		  ; 
		  
cmdRead   : 'leia' AP ID {
				verificaID(_input.LT(-1).getText());
				CmdRead _read = new CmdRead(symbolTable.get(_input.LT(-1).getText()));
				stack.peek().add(_read);
			 }
			 FP PF
		  ;		 
		  
cmdWrite  : 'escreva' AP (
	         ID {
	         	verificaID(_input.LT(-1).getText());
	         	CmdWrite _write = new CmdWrite(symbolTable.get(_input.LT(-1).getText()));
	         	stack.peek().add(_write);
	         } 
	         | 
	         TEXT {
	         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
	         	stack.peek().add(_write);
	         	
	         }
             ) FP PF
          ;		      		  
   		  
cmdAttr   : ID {
				idAtribuido = _input.LT(-1).getText();
				verificaID(idAtribuido);
				leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
				rightDT = null;
			}
         	ATTR expr PF
				{
					// logica para atribuir o valor da expressao no identificador
					Identifier id = symbolTable.get(idAtribuido);
					id.setValue(expression.eval());
					symbolTable.add(idAtribuido, id);
					
					//System.out.println("EVAL ("+expression+") = "+expression.eval());
					
					CmdAttrib _attr = new CmdAttrib(id, expression);
					stack.peek().add(_attr);
					expression = null;					
				}
		  ;   		  	
		 
cmdWhile  : 'enquanto' {
				stack.push(new ArrayList<AbstractCommand>());
				BinaryExpression _relExpr = new BinaryExpression();
				CmdWhile _cmdWhile = new CmdWhile();
			}
 			AP expr {
				_relExpr.setLeftSide(expression);
			}
			OPREL {
				_relExpr.setOperator(_input.LT(-1).getText().charAt(0));
			} 
			expr {
				_relExpr.setRightSide(expression);
				_cmdWhile.setExpr(_relExpr);
			} FP 'entao' cmd+ {
				_cmdWhile.setListaComandos(stack.pop());
			} 'fimenquanto' PF {
				stack.peek().add(_cmdWhile);		
		  	}
		  ;  
		  
expr	  : termo exprl*
          ;
          
termo     : NUMBER 
			{
				expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));
			}
		  |
		  	decimal {
		  		expression = new NumberExpression(Double.parseDouble(_input.LT(-3).getText()));
		  	}
		  |
			ID {
				verificaID(_input.LT(-1).getText());
				rightDT = symbolTable.get(_input.LT(-1).getText()).getType();
				if (leftDT != rightDT){
					throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
				}					
				
				Identifier id = symbolTable.get(_input.LT(-1).getText());
				if (id.getValue() != null){
					expression = new NumberExpression(id.getValue());
				}
				else{
					throw new RuntimeException("Semantic ERROR - Unassigned variable");
				}
			} 
		  ;
		  
exprl     : (SUM | SUB | MULT | DIV) { 
				operator = _input.LT(-1).getText().charAt(0);
				BinaryExpression _exprADD = new BinaryExpression(operator);
				_exprADD.setLeftSide(expression);
			} 
			termo
			{
				_exprADD.setRightSide(expression);
				expression = _exprADD;
				
			}
          ;		         
	
decimal : NUMBER VIRG NUMBER
		  ; 
		  	  
NUMBER	  : [0-9]+
		  ;
		  
TEXT 	  : '"' ([a-z]|[A-Z]|[0-9]|' '|'\t'|'!'|'-')* '"'
		  ;		  
		  
ATTR	  : ':='
   		  ;		
   		  
SUM	      : '+'
		  ;
		  
SUB		  : '-'		     		    
          ;
          
MULT      : '*'
		  ;
		  
DIV      : '/'
		  ;
          
OPREL     : '>' | '>=' | '<' | '<=' | '==' | '<>'
 		  ;          
   		  
ID		  : [a-z] ([a-z]|[A-Z]|[0-9])*
          ;
          
VIRG      : ','
          ;
          
PF        : '.'
          ;
          
AP	      : '('          
	      ;
	      
FP 		  : ')'
          ;	      
BLANK     : (' '| '\t' | '\n' | '\r') -> skip
          ;                                 		           		 		 