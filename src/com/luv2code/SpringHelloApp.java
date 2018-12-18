/*package com.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//load the spring configuration files
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrive bean from spring container
		
		Coach bean = context.getBean("myCoach", Coach.class);
		
		
		
		//call method on bean
		System.out.println(bean.getDailyWorkout());
		System.out.println(bean.getDailyFortune());
	
		
		
		
		//close the context
		context.close();
	}

}*/
