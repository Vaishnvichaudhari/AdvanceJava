package pratice;

public class Resturant {
   private int id;
   private String  name;
   private String cuisine;
   private int branches;
   
   
   public Resturant() {
	   
   }

public Resturant(int id, String name, String cuisine, int branches) {
	super();
	this.id = id;
	this.name = name;
	this.cuisine = cuisine;
	this.branches = branches;
}

public int getId() {
   return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCuisine() {
	return cuisine;
}
public void setCuisine(String cuisine) {
	this.cuisine = cuisine;
}
public int getBranches() {
	return branches;
}
public void setBranches(int branches) {
	this.branches = branches;
}

@Override
public String toString() {
	return "Resturant [id=" + id + ", name=" + name + ", cuisine=" + cuisine + ", branches=" + branches + "]";
}

}
