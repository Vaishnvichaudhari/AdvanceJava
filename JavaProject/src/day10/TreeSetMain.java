package day10;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		 SortedSet<String> countryNames=new TreeSet<>();
		 countryNames.add("India");
		 countryNames.add("England");
		 countryNames.add("Srilanka");
		 countryNames.add("Hongkong");
		 
		 for(String countryName:countryNames)
			 System.out.println(countryName);

	}

}
