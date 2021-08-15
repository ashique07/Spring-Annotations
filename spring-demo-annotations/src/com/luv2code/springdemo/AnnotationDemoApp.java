package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		/*
		 * BEHIND THE SCENES: 
		 * FileFortuneService fileFortuneService = new FileFortuneService();
		 * Inject Dependencies (No dependency)
		 * fileFortuneService.email = sport.properties er email
		 * fileFortuneService.team = sport.properties er team
		 * fileFortuneService.doMyStartUpStuff()
		 * 
		 * TennisCoach tennisCoach = new TennisCoach();
		 * tennisCoach.fortuneService = happyFortuneService;
		 * tennisCoach.doMyStartUpStuff()
		 * 
		 */
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//tennisCoach.doMyCleanUpStuff
		context.close();

	}

}
