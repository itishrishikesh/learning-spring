package learning.spring.ioc;

public class BaseBallCoach implements Coach{
	
	//define private field for contructor
	private FortuneService fortuneService;
	
	//define contructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getMyWorkOut() {
		return "30 Mins Batting Practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
