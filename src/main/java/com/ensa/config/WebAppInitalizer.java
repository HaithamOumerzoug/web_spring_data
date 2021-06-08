package com.ensa.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@Configuration
@EnableWebMvc
@ComponentScan("com.ensa")
public class WebAppInitalizer implements WebApplicationInitializer {

	

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		   AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
	        appContext.register(WebMvcConfig.class);
	          
	        ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
	                "SpringDispatcher", new DispatcherServlet(appContext));
	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
	          
	}
}