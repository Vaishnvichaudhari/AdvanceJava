package day5;

public class StringBuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder builder =new StringBuilder();//Creating an empty builder.
	    builder.append("Today is the ");
	    builder.append(5);
	    builder.append("day of Java class");
	    
	    System.out.println(builder);
	    
	    //Another Way to print 
//	    String message=builder.toString();
//	    System.out.println(message);
	}

}
