package two.training.services.implementations;

import org.springframework.stereotype.Component;

import two.training.services.Fortune;

@Component
public class HappyFortune implements Fortune {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
