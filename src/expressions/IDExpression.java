package expressions;

public class IDExpression extends AbstractExpression{
	private String id;
	private Number value;
	
	public Number eval() {
		return this.value;
	}
	
	public String toString() {
		return this.id;
	}
}
