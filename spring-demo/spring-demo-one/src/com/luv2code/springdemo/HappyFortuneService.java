package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		String[] fortunes = {"Today is your lucky day", 
				"You're going to do great today", "Be on the lookout for random blessings today"};
		
		return fortunes[(int)(Math.random() * 3) + 1];
	}

}
