package two.training.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import two.training.dao.Coach;

public class AnnotaionDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
