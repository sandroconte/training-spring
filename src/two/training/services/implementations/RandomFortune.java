package two.training.services.implementations;

import java.util.Random;

import org.springframework.stereotype.Component;

import two.training.services.Fortune;

@Component
public class RandomFortune implements Fortune {

	@Override
	public String getFortune() {	
		Random random = new Random();
		return random.nextBoolean() ? "This is your lucky day!" : "It will better next time";
	}

}
