package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do 50 freethrows";
	}

	@Override
	public String getDailyFortune() {
		return "Everybody love you!";
	}

}
