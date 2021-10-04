package thondu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import thondu.aambalathondu.Dinesh;
import thondu.aambalathondu.Naveen;
import thondu.bae.Arjun;
import thondu.bae.Bhuvana;
import thondu.bae.Mythili;
import thondu.bae.Sangeetha;

@Configuration
public class ThonduConfiguration {

	@Bean
	public Naveen naveen() {

		Naveen naveen = new Naveen();

		naveen.setName("Naveen Selvakumar");
		naveen.setAge(24);

		return naveen;
	}

	@Bean
	public Dinesh dinesh() {
		Dinesh dinesh = new Dinesh();

		dinesh.setName("Naveen Selvakumar");
		dinesh.setAge(24);

		return dinesh;
	}

	@Bean
	public Sangeetha sangeetha() {
		return new Sangeetha();
	}

	@Bean
	public Arjun arjun() {
		return new Arjun();
	}

	@Bean
	public Mythili mythili() {
		return new Mythili();
	}

	@Bean
	public Bhuvana bhuvana() {
		return new Bhuvana();
	}

}
