package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {

	@Override
	public String getDailyWorkOut() {		
		return "Practice your Rugby tricks told last day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
