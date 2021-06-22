package com.pierangelo1982.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg cnstructor");
	}
	
	// out setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 16 minuted";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	

}
