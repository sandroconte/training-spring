package two.training.services.implementations;

import two.training.services.Coach;
import two.training.services.Fortune;

public class SwimCoach implements Coach {

	private Fortune fortune;
	
	public SwimCoach(Fortune fortune){
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
