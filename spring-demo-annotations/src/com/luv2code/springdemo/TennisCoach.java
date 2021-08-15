package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") explicit bean id = thatSillyCoach
@Component //default bean id = tennisCoach
@Scope("singleton")
public class TennisCoach implements Coach {

	//Search @Component classes that implemented FortuneService interface. Finds HappyFortuneService class.
	@Autowired
	@Qualifier("fileFortuneService") //selects HappyFortuneService implementation of FortuneService interface
	private FortuneService fortuneService;
	
	public TennisCoach()
	{
		System.out.println("Inside constructor of TennisCoach");
	}
	
	/*
	//Search @Component classes that implemented FortuneService interface. Finds HappyFortuneService.
	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	//Search @Component classes that implemented FortuneService interface. Finds HappyFortuneService.
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println("Inside setFortuneService method of TennisCoach");
		fortuneService = theFortuneService;
	}
	*/
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("Inside init method of TennisCOach");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do tennis workout";
	}
	
	@Override 
	public String getDailyFortune()
	{
		return fortuneService.getDailyFortune();
	}
	
	//Define destroy method
	@PreDestroy
	public void doMyCleanUpStuff()
	{
		System.out.println("Inside destroy method of TennisCOach");
		
	}

}