package learning.spring.ioc;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getMyWorkOut() {
		// TODO Auto-generated method stub
		return "Run hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Track coach says:" + fortuneService.getFortune();
	}
	
	// add an init and destroy method
	public void initMethod() {
		System.out.println("Init Method called");
	}
	
	public void destroyMethod() {
		System.out.println("Destroy Method called");
	}

}
