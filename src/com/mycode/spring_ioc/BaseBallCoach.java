package com.mycode.spring_ioc;

public class BaseBallCoach implements Coach{

	@Override
	public String getDailyWorkout()
	{
		return "From baseball Coach class";
	}
}
