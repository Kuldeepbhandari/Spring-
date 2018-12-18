package com.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive the bean from config file
		 CricketCoach bean = context.getBean("myCricketCoach" , CricketCoach.class);
		 
		 //call the method
		 
		 System.out.println(bean.getDailyFortune());
System.out.println(bean.getDailyWorkout());
	}

}
