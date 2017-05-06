package training.demo;

import training.demo.dao.Coach;
import training.demo.models.BaseballCoach;
import training.demo.models.TrackCoach;

public class App {

	public static void main(String[] args) {
		Coach thecoach = new TrackCoach();
		System.out.println(thecoach.getDailyWorkout());

	}

}
