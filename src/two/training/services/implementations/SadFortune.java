package two.training.services.implementations;

import two.training.services.Fortune;

public class SadFortune implements Fortune{

	@Override
	public String getFortune(){
		return "Today is a sad day";
	}
}
