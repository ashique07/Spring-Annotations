package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public FileFortuneService()
	{
		System.out.println("Inside constructor of FileFortuneService");
	}
	
	@PostConstruct 
	public void doMyStartupStuff()
	{
		System.out.println("Inside doMyStartupStuff() of FileFortuneService");
		System.out.println(email);
		System.out.println(team);
		
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		String data[] = {email, team};
		Random myRandom = new Random();
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
