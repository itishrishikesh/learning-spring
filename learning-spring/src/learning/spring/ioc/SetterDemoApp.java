package learning.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load config spring file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoachClass theCoach = context.getBean("cricketCoach", CricketCoachClass.class);
		
		
		//call method on bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmail());

		//close the context
		context.close();

	}

}
