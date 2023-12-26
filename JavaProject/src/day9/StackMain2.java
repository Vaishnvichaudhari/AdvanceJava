package day9;

import java.util.Stack;

//Program to demonstrate Stack functionalities: push(), pop() and peek()
public class StackMain2 {

	public static void main(String[] args) {
		
		Stack dataValues = new Stack();	//Creates an empty Stack
			
		dataValues.add("Hello");
		dataValues.add("Welcome");
		dataValues.add(35);
		dataValues.add(true);
		dataValues.add(4.56);
		
		for(Object obj : dataValues)
			System.out.println(obj);
		
		System.out.println("-------------------PUSH--------------------------");
		//Pushing more items on stack
		dataValues.push("Hi");
		dataValues.push("Bye");
		for(Object obj : dataValues)
			System.out.println(obj);
		
		System.out.println("-------------------POP--------------------------");
		System.out.println("Size before POP: " + dataValues.size());
		Object poppedObject = dataValues.pop();
		System.out.println("Popped object: " + poppedObject);
		System.out.println("Size after POP: " + dataValues.size());
		
		System.out.println("-------------------PEEK--------------------------");
		System.out.println("Size before PEEK: " + dataValues.size());
		Object peekedObject = dataValues.peek();
		System.out.println("Peeked object: " + peekedObject);
		System.out.println("Size after PEEK: " + dataValues.size());
	}

}






