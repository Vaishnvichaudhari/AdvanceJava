package day10;

import java.util.HashSet;
import java.util.Set;

public class Recipe {
	private String name;
	private int preparationTime;//Minutes
	private Set<String> ingredients;
	
	public Recipe() {
		name = "Tea";
		preparationTime = 10;
		ingredients = new HashSet<>();
		ingredients.add("Water");
		ingredients.add("Sugar");
		ingredients.add("Ginger");
		ingredients.add("Tea Poweder");
		ingredients.add("Milk");
	}

	public Recipe(String name, int preparationTime, Set<String> ingredients) {
		this.name = name;
		this.preparationTime = preparationTime;
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(int preparationTime) {
		this.preparationTime = preparationTime;
	}

	public Set<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<String> ingredients) {
		this.ingredients = ingredients;
	}
	
	//This is a utility method that allows to add one ingredient at a time.
	public void addIngredient(String ingredient) {
		ingredients.add(ingredient); //Adding the accepted ingredient into the existing collection.
	}
	
	

}
