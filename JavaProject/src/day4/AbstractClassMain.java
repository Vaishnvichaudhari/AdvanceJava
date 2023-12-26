package day4;

public class AbstractClassMain {

	public static void main(String[] args) {
		//Shape sh = new Shape(); This is invalid as Shape class is abstract. Its object creation not possible
		
		Shape sh;
		sh= new Rectangle();
		sh.draw();
		sh.earse();
		
		sh=new Circle();
		sh.draw();
		
		

	}

}
