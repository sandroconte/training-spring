package two.training.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import two.training.services.Coach;
import two.training.services.Fortune;
import two.training.services.implementations.SadFortune;
import two.training.services.implementations.SwimCoach;

@Configuration
@ComponentScan("two.training.services")
@PropertySource("classpath:sport.properties")
public class Sport {
	
	@Bean
	public Fortune sadFortune(){
		return new SadFortune();
	}
	
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(sadFortune());
	}
}
