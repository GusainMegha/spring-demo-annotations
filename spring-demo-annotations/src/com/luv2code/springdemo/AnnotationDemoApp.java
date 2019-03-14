package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// 1. Read the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Get the bean from spring context
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// 3. Call a method on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		// Call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// 4. Close the context
		context.close();
	}

}
