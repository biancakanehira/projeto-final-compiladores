package expressions;

public class BinaryExpression extends AbstractExpression{

	private char operator;
	private AbstractExpression leftSide;
	private AbstractExpression rightSide;
	
	public Number eval() {
		switch(operator) {
		case '+':
			return leftSide.eval().doubleValue() + rightSide.eval().doubleValue();
		case '-':
			return leftSide.eval().doubleValue() - rightSide.eval().doubleValue();
		case '*':
			return leftSide.eval().doubleValue() * rightSide.eval().doubleValue();
		case '/':
			if (rightSide.eval().doubleValue() == 0) {
				throw new RuntimeException("ERROR - Denominator cannot be equal 0");
			} else {
				return leftSide.eval().doubleValue() / rightSide.eval().doubleValue();
			}
		default:
			return 0;
		}
	}

	public BinaryExpression(char operator, AbstractExpression leftSide, AbstractExpression rightSide) {
		super();
		this.operator = operator;
		this.leftSide = leftSide;
		this.rightSide = rightSide;
	}

	public BinaryExpression(char operator) {
		super();
		this.operator = operator;
	}

	public BinaryExpression() {
		super();
	}
	
	public String toString() {
		return leftSide.toString() + operator + rightSide.toString();
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public AbstractExpression getLeftSide() {
		return leftSide;
	}

	public void setLeftSide(AbstractExpression leftSide) {
		this.leftSide = leftSide;
	}

	public AbstractExpression getRightSide() {
		return rightSide;
	}

	public void setRightSide(AbstractExpression rightSide) {
		this.rightSide = rightSide;
	}
	
	
}
