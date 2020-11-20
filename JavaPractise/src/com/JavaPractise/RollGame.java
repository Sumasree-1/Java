package com.JavaPractise;

import java.util.Random;

public class RollGame {

	public static void main(String[] args) {
		
		int count = 0;
		int totaltimes = 5;
		
		for(int i=1;i<=totaltimes ;i++) {
			Random random = new Random();
			int die = random.nextInt(6) + 1;
			
			count = count + die;
			
			System.out.println("Roll#"+i+".  You rolled "+die + ". ");
			
			if (count == 20) {
				System.out.println("You are at " + count+ " and " + "you have won");
			}
			else if (count < 20 && i < totaltimes) {
				System.out.println("You are at " + count+ " and " + (20-count) + " less then 20");
			}
			else if (count < 20 && i==totaltimes) {
				System.out.println("You are at " + count+ " and " + (20-count) + " less then 20");
				System.out.println("Unfortunately you have not reached the limit. You lost");
			}
			else {
				System.out.println("Unfortunately you exceeded the limit. You lost");
			}
				
		}
		
	}

}
