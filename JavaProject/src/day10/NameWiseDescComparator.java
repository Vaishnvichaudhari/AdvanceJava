package day10;

import java.util.Comparator;

public class NameWiseDescComparator implements Comparator<Country> {
       
	  @Override
      public int compare(Country c1,Country c2) {
        	String name1 =c1.getName();
        	String name2 =c2.getName();
        	int comparsion = name2.compareTo(name1);
        	return comparsion;
        }
        
}
