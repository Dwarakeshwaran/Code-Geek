package thondu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import thondu.aambalathondu.Dinesh;
import thondu.aambalathondu.Naveen;

public class Thondu {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("thondubeans.xml");

		Naveen naveen = container.getBean("naveen", Naveen.class);
		
		naveen.getThonduInfo();
		naveen.getBaeInfo();
		
		/**/
		System.out.println();
		/**/
		
		Dinesh dinesh = container.getBean("dinesh", Dinesh.class);
		
		dinesh.getThonduInfo();
		dinesh.getBaeInfo();
		
		((ClassPathXmlApplicationContext)container).close();
	}

}
