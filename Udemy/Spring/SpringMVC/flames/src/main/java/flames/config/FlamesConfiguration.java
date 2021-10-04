package flames.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class FlamesConfiguration implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("Started");
		
		XmlWebApplicationContext webAppContainer = new XmlWebApplicationContext();
		webAppContainer.setConfigLocation("classpath:flames-servlet.xml");
		
		
		DispatcherServlet dServlet = new DispatcherServlet(webAppContainer);
		
		ServletRegistration.Dynamic customServlet = servletContext.addServlet("flamesServlet", dServlet);
		
		customServlet.setLoadOnStartup(1);
		customServlet.addMapping("/home/*");
	}

}
