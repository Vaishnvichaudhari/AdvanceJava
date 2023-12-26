package day2;

import java.util.Collection;

public class CRUD_Main {
	
	private static void updateResturant() {
		DaoInterface<Resturant, Integer> idao = new ResturantDao();
		//Obtaining the Restaurant which is to be modified
		Resturant currentResturant = idao.getOne(1);
		
		//Making some changes using setters
		currentResturant.setName("Green and Red Signal");
		currentResturant.setCuisine("Multicuisine");
		
		//Sending this modified state to update() method to reflect the changes into the DB
		idao.update(currentResturant);
	}
	
	
	
	private static void deleteResturant() {
		DaoInterface<Resturant, Integer> idao = new ResturantDao();
		idao.deleteOne(3);
	}
	
	
	private static void createNewResturant() {
		DaoInterface<Resturant, Integer> idao = new ResturantDao();
		Resturant rst = new Resturant(2, "Green Signal", "Oriental", 15);
		idao.create(rst);
	}
	
	

	private static void showOneResturant() {
		DaoInterface<Resturant, Integer> idao = new ResturantDao();
		Resturant rst =idao.getOne(1);
		if(rst != null)
			System.out.println(rst);
		else
			System.out.println("Restaurant with this ID does not exist");
	}
	
	
	private static void showAllResturants() {
		DaoInterface<Resturant, Integer> idao = new ResturantDao();
		Collection<Resturant> allAvailableResturants  = idao.getAll();
		//allAvailableRestaurants.stream().forEach((rst) -> System.out.println(rst));
		for(Resturant rst : allAvailableResturants)
			System.out.println(rst);
	}
	

	public static void main(String[] args) {
		showAllResturants();
//		showOneResturant();
//		createNewResturant();
//		deleteResturant();
//		updateResturant();
//		

	}

}