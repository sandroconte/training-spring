package two.training.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import two.training.services.Coach;
import two.training.services.Fortune;

@Component
public class TennisCoach implements Coach {

	private Fortune fortune;
	
	@Autowired
	public TennisCoach(){}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Autowired
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
