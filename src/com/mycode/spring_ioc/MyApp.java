package com.mycode.spring_ioc;

public class MyApp {
//Without Spring
	public static void main(String[] args) {
		// create object
		//BaseBallCoach baseBallCoach = new BaseBallCoach();
		
		Coach coach = new TrackCoach();

		// use object
		System.out.println(coach.getDailyWorkout());
		

	}

}
