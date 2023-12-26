package day4;

public class EqualsMain {

	public static void main(String[] args) {
		int x = 100;
		int y = 100;
		System.out.println("X == Y ? " + (x == y));
		
		Flower f1 = new Flower("Rose", "Red");
		Flower f2 = new Flower("Rose", "Red");
		//Flower f2 = f1;
		System.out.println("F1 == F2 ?" + (f1 == f2));
		
		boolean comparison = f1.equals(f2);
		System.out.println("F1 == F2 ?" + comparison);


	}

}
