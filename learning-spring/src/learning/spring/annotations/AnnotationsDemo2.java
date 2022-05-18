package learning.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemo2 {

	public static void main(String[] args) {
		// load config spring file
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
				
				//retrieve bean from spring container
				Coach theCoach = context.getBean("tennisCoach", Coach.class);
				
				
				//call method on bean;
				System.out.println(theCoach.getDailyWorkout());
				System.out.println(theCoach.getDailyFortune());
				
				//close the context
				context.close();
	}

}
