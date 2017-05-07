package two.training.dao.implementations;

import org.springframework.stereotype.Component;

import two.training.dao.Coach;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
