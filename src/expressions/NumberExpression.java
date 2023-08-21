package expressions;

public class NumberExpression extends AbstractExpression{
	
	private Number numberValue;
	
	public NumberExpression(Number numberValue) {
		super();
		this.numberValue = numberValue;
	}
	
	public Number getNumberValue() {
		return numberValue;
	}

	public void setNumberValue(Number numberValue) {
		System.out.println(numberValue);
		this.numberValue = numberValue;
	}
	
	public NumberExpression() {
		super();
	}

	@Override
	public Number eval() {
		// TODO Auto-generated method stub
		return numberValue;
	}
	
	public String toString(){
		return String.valueOf(numberValue);
	}
}
