package two.training.app;

import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import two.training.services.Coach;
import two.training.services.implementations.TennisCoach;

public class AnnotaionDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		context.close();
	}

}
