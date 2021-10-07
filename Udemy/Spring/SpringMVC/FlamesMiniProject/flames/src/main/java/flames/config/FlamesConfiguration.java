package flames.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(value = { @ComponentScan(basePackages = "flames.controllers"),
		@ComponentScan(basePackages = "flames.config"), @ComponentScan(basePackages = "flames.model") })
public class FlamesConfiguration {

}
