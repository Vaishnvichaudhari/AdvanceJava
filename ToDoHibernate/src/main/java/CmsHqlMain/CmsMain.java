package CmsHqlMain;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import CMS.bean.CMS;
import CMSUtils.CMSUtils;


public class CmsMain {
	private static void ConstructorExample() {
		SessionFactory factory = CMSUtils.getSessionFactory();
		Session session=factory.openSession();
		String hqlQuery="select new CMS.bean.CMS(c.courseID, c.tittle, c.duration, c.provider, c.fees) from CMS c";
		Query<CMS> hibernateQuery=session.createQuery(hqlQuery);
		List<CMS> cList=hibernateQuery.list();
		for(CMS data: cList)
			 System.out.println(data);
		session.close();
		factory.close();
	
	}

	private static void fromClauseExample() {
		SessionFactory factory = CMSUtils.getSessionFactory();
		Session session=factory.openSession();
		
		//Building hQL Query
		String hqlQuery="from CMS c";
		
		//Obtaining a reference of type 'query'
		Query<CMS> hibernateQuery=session.createQuery(hqlQuery);
		List<CMS> clist=hibernateQuery.list();
		for(CMS c: clist)
			System.out.println(c);
		session.close();
		factory.close();
		
		
	}
	public static void main(String[] args) {
		//ConstructorExample();
		fromClauseExample();
	

	}

}
