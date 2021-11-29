package net.mooctest;

import java.util.LinkedList;

public class Substitution {

	private LinkedList<Variable> from = new LinkedList<Variable>();
	private LinkedList<Value> to = new LinkedList<Value>();

	public Substitution() {

	}

	private Substitution(LinkedList<Variable> from, LinkedList<Value> to) {
		this.from = from;
		this.to = to; 
	}

	/**
	 * Returns an extended substitution if possible, returning null if not.
	 *
	 * @param variable
	 *            The variable to map from
	 * @param value
	 *            The value to map to
	 * @return The extended substitution if the variable was not previously
	 *         matched to a different value, null otherwise.
	 */
	public Substitution extend(Variable variable, Value value) {
		int index = from.indexOf(variable);
		if (index != -1) { // There exists already a mapping for this variable.
			if (!to.get(index).equals(value)) { // If it does not map to the
				return null; // same value, return null.
			}
		}
		Substitution s = new Substitution(this.from, this.to);
		s.from.add(variable);
		s.to.add(value);
		return s;
	}

	/**
	 * Assuming that this substitution is consistent, applies it on the provided
	 * atom and returns the resulting atom..
	 * 
	 * @param head
	 * @return
	 */
	public Datalog applyOn(Datalog atom) {
		Argument[] args = atom.getArguments();
		Argument[] newArgs = new Argument[args.length];
		for (int i = 0; i < args.length; i++) {
			if (args[i].isVariable()) {
				int index = this.from.indexOf(args[i].getVariable());
				if (index != -1) {
					// Perform actual substitution
					newArgs[i] = Argument.value(this.to.get(index));
				} else {
					newArgs[i] = args[i];
				}
			} else {
				newArgs[i] = args[i];
			}
		}
		return new Datalog(atom.getPredicate(), newArgs);
	}

	/**
	 * Extends this substitution with all provided substitutions that are
	 * compatible
	 * 
	 * @param subs
	 * @return List of extended versions of this substitution
	 */
	public LinkedList<Substitution> extendAll(LinkedList<Substitution> subs) {
		LinkedList<Substitution> res = new LinkedList<Substitution>();
		for (Substitution s : subs) {
			Substitution newS = this;
			for (int i = 0; i < s.from.size(); i++) {
				newS = newS.extend(s.from.get(i), s.to.get(i));
				if (newS == null)
					break;
			}
			if (newS != null) {
				res.add(newS);
			}
		}
		return res;
	}

}
