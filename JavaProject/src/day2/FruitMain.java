package day2;

public class FruitMain {

	public static void main(String[] args) {
		Fruit f1 =new Fruit();
		Fruit f2 =new Fruit("Apple" ,"Red");
		Fruit f3 =new Fruit("Watermelon" ,"Green");
		
		System.out.println("Fruit Count is:" +Fruit.fruitCount);
		
		for(int i=1; i<=5; i++) {
			Fruit f =new Fruit();
		}
		System.out.println("Latest Count is:" + f1.fruitCount);

	}

}
