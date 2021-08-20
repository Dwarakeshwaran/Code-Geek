package family;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Family {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("familybeans.xml");

		Son ace = container.getBean("ace", Son.class);

		Father whitebeard = container.getBean("whitebeard", Father.class);

		System.out.println(ace.displaySonInfo());

		System.out.println(whitebeard.displayFatherInfo());

		((ClassPathXmlApplicationContext) container).close();

	}

}
