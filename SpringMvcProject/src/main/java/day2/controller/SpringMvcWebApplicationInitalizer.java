package day2.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.eclipse.jdt.internal.compiler.lookup.AnnotatableTypeSystem;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringMvcWebApplicationInitalizer implements WebApplicationInitializer {
	//This class is used to configure front controller:DispatcherServlet to accept any request

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		WebApplicationContext ec=getContext();
		
		//Instantaiting 'DispatcherServlet' based upon web applicationcontext
		DispatcherServlet frontcontrllerServlet= new DispatcherServlet(ec);
		
        //Registering the object:DispatcherServlet using servletContext
		ServletRegistration.Dynamic dispatcher=servletContext.addServlet("frontController", frontcontrllerServlet);
		dispatcher.addMapping("/");   //Configuring DispatcherServlet to Accept any request
		
	}



private WebApplicationContext getContext() {
	AnnotationConfigWebApplicationContext wA= new AnnotationConfigWebApplicationContext();
     wA.setConfigLocations("day2");; //location of that package
     return wA;
	
}
}
