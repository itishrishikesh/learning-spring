package learning.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public TennisCoach(FortuneService fs) {
//		fortuneService = fs;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your back-hand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
