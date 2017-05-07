package two.training.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import two.training.services.Coach;
import two.training.services.Fortune;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortune")
	private Fortune fortune;
	
	public TennisCoach(){}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
