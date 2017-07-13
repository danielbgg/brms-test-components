package br.com.danielbgg;

public class Person {

	private String name;
	private String favoriteCheese;
	private String gender;
	private Integer children;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteCheese() {
		return favoriteCheese;
	}

	public void setFavoriteCheese(String favoriteCheese) {
		this.favoriteCheese = favoriteCheese;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", favoriteCheese=" + favoriteCheese + ", gender=" + gender + ", children="
				+ children + "]";
	}

}
