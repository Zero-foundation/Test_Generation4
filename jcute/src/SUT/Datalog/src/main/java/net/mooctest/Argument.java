package net.mooctest;

public class Argument {

	private final Value value;
	private final Variable variable;
	private final boolean isValue;

	private Argument(Value value, Variable variable, boolean isValue) {
		this.value = value;
		this.variable = variable;
		this.isValue = isValue;
	}

	public static Argument value(Value value) {
		return new Argument(value, null, true);
	}

	public static Argument variable(Variable variable) {
		return new Argument(null, variable, false);
	}

	public boolean isValue() {
		return this.isValue;
	}

	public boolean isVariable() {
		return !this.isValue;
	}

	public Value getValue() {
		return this.value;
	}

	public Variable getVariable() {
		return this.variable;
	}

	public String toString() {
		if (isValue)
			return value.toString();
		return variable.toString();
	}

}
