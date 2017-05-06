package training.demo.services.implementations;

import training.demo.services.Fortune;

public class HappyFortune implements Fortune {

	@Override
	public String getFortune() {		
		return "Today is your lacky day!";
	}

}
