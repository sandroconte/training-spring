package training.demo.models;

import training.demo.dao.Coach;
import training.demo.services.Fortune;

public class CricketCoach implements Coach {
	
	private Fortune fortune;
	
	public CricketCoach(){
		System.out.println("CricketCoach: inside no-args constructor");
	}
	
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
