package day11;

public class MathCalculatorMain {

	public static void main(String[] args) {
		MathCalculator adder=(a,b)-> a+b;
		MathCalculator subractor = (int p, int q) ->{
			return p-q;
			
		};
		
		int addition=adder.doCalculate(10, 20);
		int subtract=subractor.doCalculate(25, 14);
		
		System.out.println(addition);
		System.out.println(subtract);
		

	}

}
