package day11;

public class PrintableMain {

	public static void main(String[] args) {
		Printable p1=()-> System.out.println("Hello");
		p1.print();
		
		Printable p2=()->{
			System.out.println("Hiii");
			System.out.println("Manii");
		};
		p2.print();
		
		}
	}


