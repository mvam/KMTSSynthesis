package logic.booleanexpression;

import java.util.HashSet;
import java.util.Set;


public class AtomicProposition extends ABooleanExpression implements IBooleanExpression {

	private String literal;
	private Boolean value;
	
	public AtomicProposition(String literal, Boolean value) {
		super();
		this.literal = literal;
		this.value = value;
	}
	
	public String getLiteral() {
		return literal;
	}
	public void setLiteral(String literal) {
		this.literal = literal;
	}
	public Boolean getValue() {
		return value;
	}
	public void setValue(Boolean value) {
		this.value = value;
	}
	
	
	@Override
	public String toString()
	{
		return literal;
		//return literal+" = "+(value == null?"?":(value?"T":"F")); 
	}
	
	public String toStringWithValue()
	{
		return literal+" = "+(value == null?"?":(value?"T":"F"));
	}
	
	public Set<AtomicProposition> getAtomicPrepositions()
	{
		Set<AtomicProposition> result = new HashSet<AtomicProposition>();
		result.add(this);
		return result;
	}

	@Override
	public IBooleanExpression createCopiedExpression() 
	{
		return new AtomicProposition(getLiteral(), getValue());
	}
}
