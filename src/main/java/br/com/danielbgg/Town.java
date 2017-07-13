package br.com.danielbgg;

import java.util.List;

public class Town {

	private String name;
	private List<Person> people;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}

}
