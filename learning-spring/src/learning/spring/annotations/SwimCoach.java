package learning.spring.annotations;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do swimming for 24 mins each day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "You'll be a swimming champ";
	}

}
