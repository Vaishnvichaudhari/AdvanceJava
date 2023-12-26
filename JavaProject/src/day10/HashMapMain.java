package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> details = new HashMap<>();
		details.put("Facebook", 25);
		details.put("Instagram", 16);
		details.put("WhatsApp", 89);
		details.put("Twitter", 17);
	//details.put("Instagram", 17); This results into overwriting the value
		
      //Fetching all the key From this Map  
		Set<String> allKeys = details.keySet();//Returns Set of keys
		
		for(String Key: allKeys)
			System.out.println(Key);
							  
		//Iterating over the set of keys:	allAvailableKeys
				for(String key : allKeys) {
					//Obtaining a value based upon the corresponding key
					Integer value = details.get(key); //Accepting the 'key'  and returning the 'value'
					System.out.println("Key: " + key + " and Value: " + value);
				}
				System.out.println("---------------------------------------------------");
				//Fetching values from the Map directly
				Collection<Integer> allValues = details.values();
				
				for(Integer value : allValues)
					System.out.println(value);	
	}

}
