package training.demo.models;

import training.demo.dao.Coach;
import training.demo.services.Fortune;

public class BaseballCoach implements Coach{
	
	private Fortune fortune;
	
	public BaseballCoach(Fortune fortune){
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}
}
