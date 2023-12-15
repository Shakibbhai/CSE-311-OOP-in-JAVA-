package project_type_things;

import java.util.ArrayList;

public class University {
	private ArrayList<person> persons;

	public University(ArrayList<person> persons) {
		this.persons = persons;
	}

	public String getFullNames() {
		StringBuilder names = new StringBuilder();
		for (person person1 : persons) {
			names.append(person1.getFullName()).append(", ");
		}
		if (names.length() > 0) {
			names.delete(names.length() - 2, names.length());
		}
		return names.toString();
	}

	public person getOldestPerson() {
		person oldestPerson = persons.get(0);
		for (person person1 : persons) {
			if (person1.getAge() > oldestPerson.getAge()) {
				oldestPerson = person1;
			}
		}
		return oldestPerson;
	}

	public person getYoungestPerson() {
		person youngestPerson = persons.get(0);
		for (person person1 : persons) {
			if (person1.getAge() < youngestPerson.getAge()) {
				youngestPerson = person1;
			}
		}
		return youngestPerson;
	}

	public ArrayList<person> getVoters() {
		ArrayList<person> voters = new ArrayList<>();
		for (person person1 : persons) {
			if (person1.canVote()) {
				voters.add(person1);
			}
		}
		return voters;
	}

	public int getNumberOfEmployees() {
		int employeeCount = 0;
		for (person person1 : persons) {
			if (person1 instanceof Employee) {
				employeeCount++;
			}
		}
		return employeeCount;
	}
}
