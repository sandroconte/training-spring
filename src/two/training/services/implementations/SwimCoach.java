package two.training.services.implementations;

import org.springframework.beans.factory.annotation.Value;

import two.training.services.Coach;
import two.training.services.Fortune;

public class SwimCoach implements Coach {

	private Fortune fortune;
	
	@Value("${team}")
	private String team;

	@Value("${email}")
	private String email;

	
	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}

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
