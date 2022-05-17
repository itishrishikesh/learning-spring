package learning.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {

	public static void main(String[] args) {
		// Load Spring Config
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Custom.xml");
				
				//retrive bean methods
				Coach theCoach = context.getBean("myCoach", Coach.class);
				
				//call methods on bean
				System.out.println(theCoach.getMyWorkOut());
				
				context.close();

	}

}
