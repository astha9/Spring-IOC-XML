package com.mycode.spring_ioc;

public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "From Cricket Class";
    }
}
