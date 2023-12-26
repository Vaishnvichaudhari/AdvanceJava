package todo1Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CmsMAIN {

	public static void main(String[] args) {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
    Object obj=ctx.getBean("ConstructorInjection");
	CMS c= (CMS)obj;
	System.out.println("To DO RunSS!!" + c);
	

	}

}
