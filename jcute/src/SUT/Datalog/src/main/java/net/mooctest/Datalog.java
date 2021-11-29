package net.mooctest;

import java.util.Arrays;

public class Datalog {

	private final Predicate predicate;
	private final Argument[] arguments;

	public Datalog(Predicate predicate, Argument... arguments) {
		if (predicate == null) {
			throw new NullPointerException("Predicate cannot be null");
		}
		if (arguments == null) {
			throw new NullPointerException("Arguments cannot be null");
		}
		this.predicate = predicate;
		this.arguments = arguments;
	}

	public Predicate getPredicate() {
		return this.predicate;
	}

	public Argument[] getArguments() {
		return this.arguments;
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof Datalog) {
			return ((Datalog) o).predicate.equals(this.predicate)
					&& Arrays.equals(((Datalog) o).arguments, this.arguments);
		}
		return false;
	}

	public int hashCode() {
		return 17 * this.predicate.hashCode() + 13 * Arrays.hashCode(this.arguments);
	}

	/**
	 * Determine if this atom could be substituted with this fact. That is, can
	 * the variables in this atom be replaced by the values in the provided fact
	 * by a consistent substitution.
	 * 
	 * @param fact
	 *            Fact to be compared to
	 * @return true if variables in this atom can be consistently replaced to
	 *         match this fact, false otherwise.
	 */
	public boolean compatibleWith(Fact fact) {
		return this.substituteTo(fact) != null;
	}

	/**
	 * Return a consistent substitution that maps variables in this atom to the
	 * values in the provided fact
	 * 
	 * @param fact
	 *            Fact to be mapped to
	 * @return A substitution mapping the atom's variables to values in the
	 *         fact, or null if such a substitution cannot be found.
	 */
	public Substitution substituteTo(Fact fact) {
		if (!fact.getPredicate().equals(this.predicate))
			return null;
		if (fact.getValues().length != this.arguments.length)
			return null;
		Substitution s = new Substitution();
		for (int i = 0; i < fact.getValues().length; i++) {
			Argument arg = this.arguments[i];
			Value val = fact.getValues()[i];
			if (arg.isValue()) {
				if (!val.equals(arg.getValue())) {
					return null;
				} else {
					continue; // BUG possibility: perform break instead
				}
			} else {
				s = s.extend(arg.getVariable(), val);
				if (s == null)
					return null;
			}
		}
		return s;
	}

	/**
	 * Converts this atom to a fact, provided that all arguments are values.
	 * 
	 * @return This atom as a fact, or null if some of its arguments were
	 *         variables
	 */
	public Fact toFact() {
		Value[] values = new Value[this.arguments.length];
		for (int i = 0; i < this.arguments.length; i++) {
			if (this.arguments[i].isValue()) {
				values[i] = this.arguments[i].getValue();
			} else {
				return null;
			}
		}
		return new Fact(this.predicate, values);
	}

	public String toString() {
		String res = this.predicate.toString();
		res += "(";
		for (int i = 0; i < arguments.length - 1; i++) {
			res += arguments[i].toString();
			res += ",";
		}
		if (arguments.length > 0) {
			res += arguments[arguments.length - 1].toString();
		}
		res += ")";
		return res;
	}
}
