package day2;

public class Fruit {
 private  String name,color; //Creates a new copy for every object therefore they are called Instance variable
 static int fruitCount; //Creates a single copy for the whole class

 public Fruit(String name ,String color) {
	 this.name=name;
	 this.color=color;
	 fruitCount++;
 }
 
 public Fruit() {
	this.name =name;
	this.color=color;
	fruitCount++;
}
 public String getName() {
	return name;
}

 public void setName(String name) {
	this.name = name;
}

 public String getColor() {
	return color;
}

 public void setColor(String color) {
	this.color = color;
}

}
