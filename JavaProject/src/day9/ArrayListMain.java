package day9;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList dataValues = new ArrayList();
		dataValues.add("Hello");
		dataValues.add("Hello");
		dataValues.add("Hello");
		dataValues.add("Hello");
		dataValues.add("Hello");
		dataValues.add("Welcome");
		dataValues.add(35);
		dataValues.add(true);
		dataValues.add(4.56);
		
		for(Object obj : dataValues)
			System.out.println(obj);
	}

}
