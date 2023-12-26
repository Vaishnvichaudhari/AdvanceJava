package day2;

public class PersonArrayofOject {
	private String name;
	private int age;

	public PersonArrayofOject() {
		name="vaishnavi";
		age=21;
	}

	public PersonArrayofOject(int age, String name) {
		this.age = age;
		this.name = name;
	}


	public PersonArrayofOject(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

  private static void printMinorPersonNames(PersonArrayofOject[] pref) {
	
	for(PersonArrayofOject currentPerson :pref) {
		int currentPersonAge =currentPerson.getAge();
		String currentPersonName =currentPerson.getName();
		if(currentPersonAge <18)
			System.out.println(currentPersonName);
	}
}
  
  public static void main(String[] args) {
		//Creating an array of type PersonArrayofObject
	   PersonArrayofOject p[] = new PersonArrayofOject[3];
       p[0]=new PersonArrayofOject();
       p[1] =new PersonArrayofOject("Manali" ,23);
       p[2]=new PersonArrayofOject(17,"Roshani");
       
      printMinorPersonNames(p);
	}

}
