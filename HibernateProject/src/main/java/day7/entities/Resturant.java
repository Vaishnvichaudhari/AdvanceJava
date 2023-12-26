package day7.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //Marks this class as an Entity
@Table(name="new_restaurant_master")   //maps this entity class with relevant table

public class Resturant {
	@Id   //Marks this field as an identity
	@Column(name="id")
	 private int id;
	
	@Column(name="name")
   private String  name;
	
	@Column(name="cuisine")
   private String cuisine;
	

	@Column(name="branches")
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
