package training.demo.models;

import training.demo.dao.Coach;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}
}
