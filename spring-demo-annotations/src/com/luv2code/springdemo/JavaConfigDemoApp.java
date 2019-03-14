package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// 1. Read the spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// 2. Get the bean from spring context
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		// 3. Call a method on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		// Call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// 4. Close the context
		context.close();
	}

}
