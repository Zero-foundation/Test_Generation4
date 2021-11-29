package net.mooctest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class Program {

	private final Rule[] program;

	public Program(Rule... rules) {
		this.program = rules;
	}

	public Rule[] getProgram() {
		return this.program;
	}

	public boolean canDerive(Fact fact, Fact[] database) {
		Datalog atom = new Datalog(fact.getPredicate(), valToArg(fact.getValues()));
		return query(atom, database).length == 1;
	}

	private Argument[] valToArg(Value[] values) {
		Argument[] arguments = new Argument[values.length];
		for (int i = 0; i < values.length; i++)
			arguments[i] = Argument.value(values[i]);
		return arguments;
	}

	/**
	 * Given a database, returns all facts that can be derived that match the
	 * form of the provided atom
	 * 
	 * @param atom
	 *            Query atom
	 * @param database
	 *            Starting database
	 * @return All facts in provided database and derived using the program that
	 *         match the query
	 */
	public Fact[] query(Datalog atom, Fact[] database) {
		Fact[] allFacts = deriveAll(database);
		LinkedList<Fact> result = new LinkedList<Fact>();
		for (Fact fact : allFacts) {
			if (atom.compatibleWith(fact))
				result.add(fact);
		}
		return result.toArray(new Fact[0]);
	}

	/**
	 * Given a database, keep applying the rules in this program until no new
	 * facts can be derived.
	 * 
	 * @param database
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Fact[] deriveAll(Fact[] database) {
		HashSet<Fact> allFacts = new HashSet<Fact>(Arrays.asList(database));
		HashSet<Fact> oldFacts = new HashSet<Fact>(Arrays.asList(database));
		int newFacts = 0;
		do {
			for (Rule rule : program) {
				allFacts.addAll(rule.deriveOnce(allFacts));
			}
			newFacts = allFacts.size() - oldFacts.size();
			oldFacts = (HashSet<Fact>) allFacts.clone();
		} while (newFacts != 0);
		return allFacts.toArray(new Fact[0]);
	}

}
