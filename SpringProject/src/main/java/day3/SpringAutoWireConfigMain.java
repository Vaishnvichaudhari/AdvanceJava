package day3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAutoWireConfigMain {

	public static void main(String[] args) {
		Class<SpringAutoWireConfig> c= SpringAutoWireConfig.class;
		AnnotationConfigApplicationContext an= new AnnotationConfigApplicationContext(c);
		Object obj=an.getBean("myCar");
		System.out.println(obj);

	}

}
