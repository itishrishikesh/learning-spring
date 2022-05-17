package learning.spring.ioc;

public class CricketCoachClass implements Coach{
	private FortuneService fortuneService;
	
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Email Setter: Cricket Coach");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Team Setter: Cricket Coach");
		this.team = team;
	}

	private String team;
	
	
	@Override
	public String getMyWorkOut() {
		// TODO Auto-generated method stub
		return "practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
