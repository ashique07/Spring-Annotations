package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService()
	{
		//System.out.println("Inside constructor of HappyFortuneService");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	}

}
