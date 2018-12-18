package com.luv2code;

public class CricketCoach implements Coach {
 
	private FortuneService fortuneService;
	
	
	// create no - arg constructor
	
	public CricketCoach()
	{
		System.out.println("inside the no arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "pratice daily 25 minute in bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
