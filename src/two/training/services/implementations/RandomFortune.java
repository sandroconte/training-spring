package two.training.services.implementations;

import java.util.Random;

import org.springframework.stereotype.Component;

import two.training.services.Fortune;

@Component
public class RandomFortune implements Fortune {
	
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward",
			"This is your lucky day!",
			"It will better next time"
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {			
		return data[random.nextInt(data.length)];
	}

}
