package training.demo.models;

import training.demo.dao.Coach;
import training.demo.services.Fortune;

public class CricketCoach implements Coach {
	
	private Fortune fortune;
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CricketCoach(){
		System.out.println("CricketCoach: inside no-args constructor");
	}
	
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
