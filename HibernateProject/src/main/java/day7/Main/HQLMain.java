package day7.Main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import day7.Beans.RestaurantNameAndBranches;
import day7.entities.Resturant;
import day7.utils.HibernateUtils;

public class HQLMain {
	
	private static void constructorxpressionExample() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		String hqlQuery="select new day7.Beans.RestaurantNameAndBranches(rs.name,rs.branches) from Resturant rs";
		Query<RestaurantNameAndBranches> hibernateQuery=session.createQuery(hqlQuery);
		List<RestaurantNameAndBranches> rList=hibernateQuery.list();
		for(RestaurantNameAndBranches data: rList)
			System.out.println(data);
		session.close();
		factory.close();
	
	}
	
	
	
	private static void selectClauseExample() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		//Building hQL Query for loading name and branches
		String hqlQuery="select rs.name,rs.branches from Resturant rs";
		Query<Object[]> hibernateQuery=session.createQuery(hqlQuery);
		List<Object[]> resturantDataList=hibernateQuery.list();
		for(Object[] rData :resturantDataList) {
			Object rName=rData[0];
			Object rBran = rData[1];
			System.out.println(rName+ "has" + rBran + "branches");
		}
		session.close();
		factory.close();
		
	}
	private static void fromClauseExample() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		//Building hQL Query
		String hqlQuery="from Resturant rs";
		
		//Obtaining a reference of type 'query'
		Query<Resturant> hibernateQuery=session.createQuery(hqlQuery);
		List<Resturant> restaurantlist=hibernateQuery.list();
		for(Resturant rst:restaurantlist)
			System.out.println(rst);
		session.close();
		factory.close();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fromClauseExample();
		//selectClauseExample();
		//constructorxpressionExample();
		

	}

}
