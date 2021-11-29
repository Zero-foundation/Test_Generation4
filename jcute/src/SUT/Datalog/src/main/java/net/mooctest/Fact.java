package net.mooctest;

import java.util.Arrays;

public class Fact {

	private final Predicate predicate;
	private final Value[] values;

	public Fact(Predicate predicate, Value... values) {
		if (predicate == null) {
			throw new NullPointerException("Predicate cannot be null");
		}
		if (values == null) {
			throw new NullPointerException("Values cannot be null");
		}
		this.predicate = predicate;
		this.values = values;
	}

	public Predicate getPredicate() {
		return this.predicate;
	}

	public Value[] getValues() {
		return this.values;
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof Fact) {
			return ((Fact) o).predicate.equals(this.predicate)
					&& Arrays.equals(((Fact) o).values, this.values);
		}
		return false;
	}

	public int hashCode() {
		return 17 * this.predicate.hashCode() + 13 * Arrays.hashCode(this.values);
	}

	public String toString() {
		String res = this.predicate.toString();
		res += "(";
		for (int i = 0; i < values.length - 1; i++) {
			res += values[i].toString();
			res += ",";
		}
		if (values.length > 0) {
			res += values[values.length - 1].toString();
		}
		res += ")";
		return res;
	}

}
