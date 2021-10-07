package flames.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * public class FlamesInitialiser implements WebApplicationInitializer {
 * 
 * public void onStartup(ServletContext servletContext) throws ServletException
 * { System.out.println("Started");
 * 
 * AnnotationConfigWebApplicationContext webAppContainer = new
 * AnnotationConfigWebApplicationContext();
 * webAppContainer.register(FlamesConfiguration.class);
 * 
 * DispatcherServlet dServlet = new DispatcherServlet(webAppContainer);
 * 
 * ServletRegistration.Dynamic customServlet =
 * servletContext.addServlet("flamesServlet", dServlet);
 * 
 * customServlet.setLoadOnStartup(1); customServlet.addMapping("/home/*"); }
 * 
 * }
 */

public class FlamesInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		@SuppressWarnings("rawtypes")
		Class[] arr = { FlamesConfiguration.class };
		return arr;
	}

	@Override
	protected String[] getServletMappings() {

		String[] arr = { "/home/*" };
		return arr;
	}
}