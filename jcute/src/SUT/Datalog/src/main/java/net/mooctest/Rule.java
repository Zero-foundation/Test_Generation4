package net.mooctest;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Rule {

	private final Datalog head;
	private final Datalog[] body;

	public Rule(Datalog head, Datalog... body) {
		this.head = head;
		this.body = body;
	}

	public Datalog getHead() {
		return this.head;
	}

	public Datalog[] getBody() {
		return this.body;
	}

	/**
	 * Finds all substitutions that satisfy the body of this rule such that the
	 * resulting facts are in the database, then applies these substitutions on
	 * the head of the rule.
	 * 
	 * @param database
	 *            Database to find satisfying body of the rule in
	 * @return List of facts on the head of this rule
	 */
	public LinkedList<Fact> deriveOnce(Collection<Fact> database) {
		LinkedList<Datalog> bodyList = new LinkedList<Datalog>(Arrays.asList(body));
		LinkedList<Substitution> subs = findAllSubstitutions(database, bodyList);
		LinkedList<Fact> result = new LinkedList<Fact>();
		for (Substitution s : subs) {
			result.add(s.applyOn(head).toFact());
		}
		return result;
	}

	/**
	 * Find all consistent substitutions that map the atoms in the worklist to
	 * facts in the database.
	 * 
	 * @param database
	 *            Database of facts
	 * @param workList
	 *            list of atoms to be mapped
	 * @return A list of all substitutions that map all atoms in the worklist to
	 *         facts in the database
	 */
	private static LinkedList<Substitution> findAllSubstitutions(
			Collection<Fact> database, LinkedList<Datalog> workList) {

		LinkedList<Substitution> res = new LinkedList<Substitution>();
		// no atoms: empty substitution
		if (workList.size() == 0) {
			res.add(new Substitution());
			return res;
		}
		// else: find all substitutions for the first atom.
		for (Fact fact : database) {
			Substitution s = workList.get(0).substituteTo(fact);
			if (s == null)
				continue;
			// If we can substitute to this fact, apply substitution on rest of
			// atoms in workList.
			LinkedList<Datalog> newWorkList = new LinkedList<Datalog>();
			for (int i = 1; i < workList.size(); i++) {
				newWorkList.add(s.applyOn(workList.get(i)));
			}
			// And call method recursively.
			LinkedList<Substitution> recSub = findAllSubstitutions(database,
					newWorkList);
			// Extend substitution s with those recursively found and add to
			// result.
			res.addAll(s.extendAll(recSub));
		}
		return res;
	}
	
	public String toString() {
		String res =head.toString() + " :- ";
		for (int i = 0; i < body.length - 1; i++) {
			res += body[i].toString();
			res += ",";
		}
		if (body.length > 0) {
			res += body[body.length - 1].toString();
		}
		return res + ".";
	}
}
