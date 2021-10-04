package thondu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import thondu.aambalathondu.Dinesh;
import thondu.aambalathondu.Naveen;

public class Thondu {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(ThonduConfiguration.class);

		Naveen naveen = container.getBean("naveen", Naveen.class);
		
		naveen.getThonduInfo();
		naveen.getBaeInfo();
		
		/**/
		System.out.println();
		/**/
		
		Dinesh dinesh = container.getBean("dinesh", Dinesh.class);
		
		dinesh.getThonduInfo();
		dinesh.getBaeInfo();
		
		((AnnotationConfigApplicationContext)container).close();
	}

}
