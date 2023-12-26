package day10;

import java.util.HashSet;
import java.util.Set;

public class RecipeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipe r1 = new Recipe();//This is the default recipe
		
		//Creating 2nd Recipe using parameterized constructor
		Set<String> recipe2Ingredients = new HashSet<>();
		recipe2Ingredients.add("Cabbage");
		recipe2Ingredients.add("Mayo");
		recipe2Ingredients.add("Green Peas");
		recipe2Ingredients.add("Pineapple");
		recipe2Ingredients.add("Olives");
		
		Recipe r2 = new Recipe("Russian Salad", 30, recipe2Ingredients);
		
		//Creating 3rd Recipe using utility method
		Set<String>  recipe3Ingredients = new HashSet<>();
		Recipe r3 = new Recipe("Mango Shake", 20, recipe3Ingredients);
		r3.addIngredient("Mangies");
		r3.addIngredient("Milk");
		r3.addIngredient("Sugar");
		r3.addIngredient("Ice");
		
		System.out.println("Printing 2nd recipe data:");
		System.out.println("Name: " + r2.getName());
		System.out.println("Preparation Time: " + r2.getPreparationTime() + " Minutes");
		System.out.println("Ingredients: ");
		Set<String> r2Ingredients = r2.getIngredients();
		for(String ing : r2Ingredients)
			System.out.println(ing);
		

	}

}
