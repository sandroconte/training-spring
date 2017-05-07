package two.training.dao.implementations;

import org.springframework.stereotype.Component;

import two.training.dao.Coach;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
