package Day1;
//Abstraction and Encapsulation Example
public class Planet {
  private String  name;
  private int moons;
  
	//Fields 'name' and 'moons' are declared as 'private'; hence they are not accessible from outside this class.
  public void assignValue(String nm , int mn) {
	 name=nm;
	 moons=mn;
  }
   public  String retriveValue() {
	  String PlanetInfo = name + "," + moons;
	   return PlanetInfo;
  
  }
 
}
