package ast;

import java.util.List;

import expressions.AbstractExpression;

public class CmdWhile extends AbstractCommand {

	private AbstractExpression expr;
	private List<AbstractCommand> listaComandos;
	
	public CmdWhile() {
		super();
	}
	
	public CmdWhile(AbstractExpression expr) {
		super();
		this.expr = expr;
	}
	
	@Override
	public String generateCode() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		for (AbstractCommand cmd: listaComandos) {
			str.append(cmd.generateCode());
		}
		return "while (" + expr.toString() + ") {\n " + str.toString() + "}\n";
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public AbstractExpression getExpr() {
		return expr;
	}
	
	public void setExpr(AbstractExpression expr) {
		this.expr = expr;
	}
	
	public List<AbstractCommand> getListaComandos() {
		return listaComandos;
	}
	
	public void setListaComandos(List<AbstractCommand> listaComandos) {
		this.listaComandos = listaComandos;
	}
}
