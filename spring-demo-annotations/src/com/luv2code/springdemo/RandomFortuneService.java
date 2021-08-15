package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	private String [] data = {"First Random", "Second Random", "Third Random"};
	Random myRandom = new Random();
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
