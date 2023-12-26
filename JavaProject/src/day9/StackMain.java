package day9;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack dataValues = new Stack();	//Creates an empty Stack
		
		//Adding some values into stack
		dataValues.add("Hello");
		dataValues.add("Welcome");
		dataValues.add(35);
		dataValues.add(true);
		dataValues.add(4.56);
		
		//Retrieving values from stack
		int size = dataValues.size(); //Retrieving the size of stack: Number of elements present
		for(int index = 0; index < size; index++) {
			Object value = dataValues.get(index);
			System.out.println(value);
		}

	}

}