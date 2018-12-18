package com.luv2code;

public class BaseBallCoach implements Coach {
	
	//define a private field for Dependency
	
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}

	public String getDailyWorkout()
	{
		return "spend 30 minute on batting practise";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	}

	
	

