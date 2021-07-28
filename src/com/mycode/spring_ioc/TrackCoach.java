package com.mycode.spring_ioc;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "From TrackCoach class";
	}

}
