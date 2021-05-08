package com.pierangelo1982.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new BaseballCoach();
		// use the object
		System.out.println(theCoach.getDailyWorkout());
		
		Coach theTrackCoach = new TrackCoach();
		System.out.println(theTrackCoach.getDailyWorkout());
	}

}
