package net.mooctest;

public class Variable {

	private final String identifier;

	public Variable(String identifier) {
		if (identifier == null) {
			throw new NullPointerException("Identifier cannot be null");
		}
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof Variable) {
			return ((Variable) o).identifier.equals(this.identifier);
		}
		return false;
	}

	public int hashCode() {
		return identifier.hashCode();
	}
	
	public String toString() {
		return "VAR:" + identifier;
	}

}
