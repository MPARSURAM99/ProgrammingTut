package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component

//	Use component scan to find the bean;
@ComponentScan("beans")
public class JavaBasedConfigurationFile {
	
}
