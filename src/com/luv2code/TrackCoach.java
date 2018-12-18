package com.luv2code;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Kepp klam and Focus on your Goal";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it:"+ fortuneService.getFortune();
	}

	

	


		
	}


