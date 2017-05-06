package training.demo.models;

import training.demo.dao.Coach;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

}
