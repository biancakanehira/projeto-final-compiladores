package symbols;

public class Identifier {
	private String text;
	private DataType type;
	private Number  value;
	private Boolean isDouble;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public DataType getType() {
		return type;
	}

	public void setType(DataType type) {
		this.type = type;
	}
	
	public Boolean getIsDouble() {
		return isDouble;
	}
	
	public void setIsDouble(Boolean isDouble) {
		this.isDouble = isDouble;
	}

	public Identifier(String text, DataType type) {
		super();
		this.text = text;
		this.type = type;
	}

	public Identifier() {
		super();
	}

	@Override
	public String toString() {
		return "Identifier [text=" + text + ", type=" + type + ", value=" + value + "]";
	}

	public Number getValue() {
		return value;
	}

	public void setValue(Number value) {
		this.value = value;
	}
	
	

}
