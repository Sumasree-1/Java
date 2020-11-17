package com.JavaPractise;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// On a [adjective] [season of the year] day,I drink a minimum of [whole number] 
//		cups of coffee
	
		System.out.println("Please enter an adjective");
		Scanner scanner = new Scanner(System.in);
		String adjective = scanner.next();
		
		System.out.println("Please enter season of the year");
		String season = scanner.next();
		
		System.out.println("Please enter any whole number");
		int number = scanner.nextInt();
		scanner.close();
		
		System.out.println("On a " + adjective + " " + season + "day, I drink a minimum "
				+ "of " + number + "cups of coffee" );
				
	}

}
