package com.pierangelo1982.springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spending 30 minutes on batting practice";
	}
}
