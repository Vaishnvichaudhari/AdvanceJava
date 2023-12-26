package day11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
	    List<Integer> allNumbers= Arrays.asList(34,78,98,21,17);
	    Stream<Integer> intStream =allNumbers.stream();
	    
	    Consumer<Integer> intconsumer= num ->System.out.println(num*10);
	    intStream.forEach(intconsumer);
	    
	    
	    

	}

}
