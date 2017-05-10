package two.training.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import two.training.services.Coach;
import two.training.services.Fortune;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortune")
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
