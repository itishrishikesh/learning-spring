package learning.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//local spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeDemo.xml");		
		
		
		//retrive bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("result - " + result);
		
		System.out.println(theCoach);
		
		System.out.println(alphaCoach);

	}

}
