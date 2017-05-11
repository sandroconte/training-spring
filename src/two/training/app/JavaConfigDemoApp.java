package two.training.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import two.training.configuration.Sport;
import two.training.services.Coach;
import two.training.services.implementations.SwimCoach;
import two.training.services.implementations.TennisCoach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Sport.class);
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		context.close();
	}

}
