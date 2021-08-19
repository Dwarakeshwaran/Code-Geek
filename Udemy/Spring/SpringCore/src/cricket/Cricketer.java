package cricket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		
		Batsman batsman = container.getBean("batsman", Batsman.class);
		
		System.out.println(batsman);
		
		((ClassPathXmlApplicationContext)container).close();

	}

}
