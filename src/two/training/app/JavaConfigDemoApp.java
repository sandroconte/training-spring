package two.training.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import two.training.configuration.Sport;
import two.training.services.Coach;
import two.training.services.implementations.TennisCoach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Sport.class);
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//System.out.println(theCoach.getEmail());
		//System.out.println(theCoach.getTeam());
		context.close();
	}

}
