package net.mooctest;

public class Value {

	private final String value;

	public Value(String value) {
		if (value == null) {
			throw new NullPointerException("Value cannot be null");
		}
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof Value) {
			return ((Value) o).value.equals(this.value);
		}
		return false;
	}

	public int hashCode() {
		return value.hashCode();
	}
	
	public String toString() {
		return value;
	}

}
