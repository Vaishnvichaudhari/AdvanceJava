package day2;

public class MathOperation {
   private static float PI=3.14f;  //Since PI is 'public' and 'static' it can be accessed from anywhere using ClassName.variableName format
	
   private static int doAdd(int x,int y) {
	   return x+y;
   }
   public static void main(String[] args) {
	System.out.println("PI:" + MathOperation.PI);//we can make static or make separate class for static 
	System.out.println("Addition is:" + MathOperation.doAdd(3, 2));

	}

}
