package learning.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemo {

	public static void main(String[] args) {
		// load config spring file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
				
				//retrieve bean from spring container
				Coach theCoach = context.getBean("tennisCoach", Coach.class);
				
				
				//call method on bean;
				System.out.println(theCoach.getDailyWorkout());
				System.out.println(theCoach.getDailyFortune());
				
				//close the context
				context.close();
	}

}
