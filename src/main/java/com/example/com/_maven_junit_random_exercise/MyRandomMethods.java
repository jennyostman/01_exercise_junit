package com.example.com._maven_junit_random_exercise;

import java.util.Random;


public class MyRandomMethods {
	
	Random random = new Random();
	
	public int randomBetween1And10(){
		int value = random.nextInt(10-1)+1; 
		return value;
	}
	
	public int randomBetween11And20(){
		int value = random.nextInt(20-11)+11; 
		return value;
	}
	
	public int randomBetween21And30(){
		int value = random.nextInt(30-21)+21; 
		return value;
	}
	
	public int randomBetween31And40(){
		int value = random.nextInt(40-31)+31; 
		return value;
	}
	
	public int randomBetween41And50(){
		int value = random.nextInt(50-41)+41; 
		return value;
	}
	
}
