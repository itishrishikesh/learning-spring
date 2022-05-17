package learning.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load Spring Config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean methods
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getMyWorkOut());
		
		//lets call our new methods for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
