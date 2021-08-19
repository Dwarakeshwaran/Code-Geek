package cricket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");

		// Batsman

		Batsman batsman = container.getBean("batsman", Batsman.class);

		System.out.println(batsman.displayBatsmanInfo());
		batsman.getTeamInfo();

		// Bowler

		Bowler bowler = container.getBean("bowler", Bowler.class);

		System.out.println(bowler.displayBowlerInfo());
		bowler.getTeamInfo();

		((ClassPathXmlApplicationContext) container).close();

	}

}
