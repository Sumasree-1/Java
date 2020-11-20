package com.oops;

import java.util.Scanner;

public class HomeAreaCalculator2 {
	private Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		HomeAreaCalculator2 calculator = new HomeAreaCalculator2();
		Rectangle Kitchen = calculator.getRoom();
		Rectangle Dining = calculator.getRoom();
		calculator.scanner.close();
		double totalArea = calculator.calculateArea(Kitchen,Dining);
		
		System.out.println("Total Area of Kitchen and Dining is: " + totalArea);
	}

	public Rectangle getRoom() {
		
		
		System.out.println("Enter the length of your Room:");
		double length = scanner.nextDouble();
		
		System.out.println("Enter the width of your Room:");
		double width = scanner.nextDouble();
		
		
		
		return new Rectangle(length,width);
	}
	
	public double calculateArea(Rectangle rectangle1, Rectangle rectangle2) {
		return rectangle1.calculateArea() + rectangle2.calculateArea();
	}
}
