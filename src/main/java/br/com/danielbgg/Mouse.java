package br.com.danielbgg;

public class Mouse {

	private String name;
	private String favoriteCheese;

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
		return "Mouse [name=" + name + ", favoriteCheese=" + favoriteCheese + "]";
	}

}
