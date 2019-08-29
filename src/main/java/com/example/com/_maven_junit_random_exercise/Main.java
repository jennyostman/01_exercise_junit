package com.example.com._maven_junit_random_exercise;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        MyRandomMethods mrm = new MyRandomMethods();
        
        for(int i = 0; i < 5; i++) {
        	System.out.println("value mellan 1-10: " + mrm.randomBetween1And10());
        	System.out.println("value mellan 11-20: " + mrm.randomBetween11And20());
        	System.out.println("value mellan 21-30: " + mrm.randomBetween21And30());
        	System.out.println("value mellan 31-40: " + mrm.randomBetween31And40());
        	System.out.println("value mellan 41-50: " + mrm.randomBetween41And50());
        }
    }
    
}
