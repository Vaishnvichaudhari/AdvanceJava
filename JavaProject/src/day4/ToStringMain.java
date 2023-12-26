package day4;

public class ToStringMain {

	public static void main(String[] args) {
		
			int x = 10;
			System.out.println(x);
			
			Flower f1 = new Flower();
			//System.out.println(f1.getName() + ", " + f1.getColor());
			System.out.println(f1);//Gives a call to toString() implicitly.
			String flowerData = f1.toString();//Call to toString() is explicit
			System.out.println(flowerData);


	}

}
