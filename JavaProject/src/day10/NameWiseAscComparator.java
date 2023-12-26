package day10;

import java.util.Comparator;

public class NameWiseAscComparator implements Comparator<Country> {

	@Override
	public int compare(Country o1, Country o2) {
		// TODO Auto-generated method stub
		String name1= o1.getName();
		String name2= o2.getName();
		
		int comparison = name1.compareTo(name2);
		return comparison;
	}

}
