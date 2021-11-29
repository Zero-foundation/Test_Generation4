package net.mooctest;

public class Predicate {

	private final String name;

	public Predicate(String name) {
		if (name == null) {
			throw new NullPointerException("Name cannot be null");
		}
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof Predicate) {
			return ((Predicate) o).name.equals(this.name);
		}
		return false;
	}

	public int hashCode() {
		return name.hashCode();
	}
	
	public String toString() {
		return name;
	}

}
