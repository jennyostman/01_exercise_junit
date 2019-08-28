package com.example.com._maven_junit_random_exercise;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;


public class TestMyRandomMethods {
	
	MyRandomMethods mrm = new MyRandomMethods();
	public static final Logger LOG = Logger.getLogger(MyRandomMethods.class.getName()); 
	
	@Test
	public void testFirstRandom() {
		System.out.println("\nETT");
		int value = 0;
		for (int i = 0; i < 10;i++) {
			value = mrm.randomBetween1And10();
			// System.out.println("value: " + value);
			LOG.info("Testing the method randomBetween1And10 with: " + value);
			assertTrue(value >= 1 && value <= 10);
		}
	}
	
	@Test
	public void testSecondRandom() {
		System.out.println("\nTVÅ");
		int value = 0;
		for (int i = 0; i < 10;i++) {
			value = mrm.randomBetween11And20();
			// System.out.println("value: " + value);
			LOG.info("Testing the method randomBetween11And20 with: " + value);
			assertTrue(value >= 11 && value <= 20);
		}
	}
	
	@Test
	public void testThirdRandom() {
		System.out.println("\nTRE");
		int value = 0;
		for (int i = 0; i < 10;i++) {
			value = mrm.randomBetween21And30();
			// System.out.println("value: " + value);
			LOG.info("Testing the method randomBetween21And30 with: " + value);
			assertTrue(value >= 21 && value <= 30);
		}
	}
	
	@Test
	public void testFourthRandom() {
		System.out.println("\nFYRA");
		int value = 0;
		for (int i = 0; i < 10;i++) {
			value = mrm.randomBetween31And40();
			// System.out.println("value: " + value);
			LOG.info("Testing the method randomBetween31And40 with: " + value);
			assertTrue(value >= 31 && value <= 40);
		}
	}
	
	@Test
	public void testFifthRandom() {
		System.out.println("\nFEM");
		int value = 0;
		for (int i = 0; i < 10;i++) {
			value = mrm.randomBetween41And50();
			// System.out.println("value: " + value);
			LOG.info("Testing the method randomBetween41And50 with: " + value);
			assertTrue(value >= 41 && value <= 50);
		}
	}

}
