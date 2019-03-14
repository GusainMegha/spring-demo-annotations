package com.luv2code.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day !!";
	}
	
	/*
	@PostConstruct
	public void doStartUpStuffFortuneService() {
		System.out.println("HappyFortuneService : Inside doStartUpStuffFortuneService");
	}
	*/
}
