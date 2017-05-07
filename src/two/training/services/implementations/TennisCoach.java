package two.training.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import two.training.services.Coach;
import two.training.services.Fortune;

@Component
public class TennisCoach implements Coach {

	private Fortune fortune;
	
	@Autowired
	public TennisCoach(Fortune fortune){
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
