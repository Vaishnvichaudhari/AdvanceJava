package day2.Programmatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PureAnnotaionBasedConfigurationMain {

	public static void main(String[] args) {
		 Class<SpringConfig> configurationUnit = SpringConfig.class;
		 AnnotationConfigApplicationContext annoCtx= new AnnotationConfigApplicationContext(configurationUnit);
		 
		 //The Above Statement handles the activities for the registration as well as refreshing the context
		 //Therefore there is no need to invoke 'register()' and 'refresh()' method separately.
		 
		 Class<Test> testRef=Test.class;
		 Test testObj=annoCtx.getBean(testRef);


	}

}
