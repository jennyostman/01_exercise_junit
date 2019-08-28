package com.example.com._maven_junit_random_exercise;

import java.util.Random;


public class MyRamdonMethods {
	
	Random random = new Random();
	
	public int randomBetween1And10(){
		int value = random.nextInt(10-1)+1; 
		return value;
	}
	
}
