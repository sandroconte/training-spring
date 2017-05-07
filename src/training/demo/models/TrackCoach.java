package training.demo.models;

import training.demo.dao.Coach;
import training.demo.services.Fortune;

public class TrackCoach implements Coach {
	
	private Fortune fortune;
	
	public TrackCoach(Fortune fortune){
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}	
}
