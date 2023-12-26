package pratice;

import java.util.Collection;
import java.util.Scanner;

public class MAin {
	 private static void showAll() {
		 DaoInterface<Resturant,Integer> idao= new RDao();
		 Collection<Resturant> allRest= idao.getAll();
		 for(Resturant rs:allRest)
			 System.out.println(rs);
		 
	 }

	 private static void getOne(int id) {
		 DaoInterface<Resturant,Integer> idao= new RDao();
		 Resturant res = idao.GetOne(id);
		 System.out.println(res);
	 }
	 
	 private static void createOne() {
		 DaoInterface<Resturant , Integer> idao= new RDao();
		   Resturant rst = new Resturant(80, "ChessyBug", "Oriental", 9);
		 idao.create(rst);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          // showAll();
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter id Want to Fetch:");
//		int id = sc.nextInt();
//		getOne(id);
		
		
	   createOne();
		
	}

}
