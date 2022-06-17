package com.luv2code.springdemo;

public class BasketballCoach implements Coach{

	private FortuneService fortuneService;

	public BasketballCoach() {
		
	}
	
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do 100 layups";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " +fortuneService.getFortune();
	}

}
