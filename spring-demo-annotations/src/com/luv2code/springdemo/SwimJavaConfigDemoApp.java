package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// 1. Read the spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// 2. Get the bean from spring context
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// 3. Call a method on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		// Call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods.... has the property value injected
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		// 4. Close the context
		context.close();
	}

}
