package com.oops;

public class HomeAreaCalculator {

	public static void main(String args[]) {
		//For Rectangle-1
		//Create instance of Rectangle
		Rectangle room1 = new Rectangle();
		room1.setLength(50);
		room1.setWidth(25);
		
		double areaOfRoom1 = room1.calculateArea();
		
		//For Rectangle-2
		
		Rectangle room2 = new Rectangle(40,20);
		double areaOfRoom2 = room2.calculateArea();
			
		double totalArea = areaOfRoom1 + areaOfRoom2;
				
		System.out.println("Area of 2 Rooms: "+totalArea);
	}
}
