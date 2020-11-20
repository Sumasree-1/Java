package com.JavaPractise;

public class Calculations {

	public Integer add(Integer arg1, Integer arg2) {
		int result = arg1 + arg2;
		return result;
	}
	public static void main(String[] args){
		Calculations cal = new Calculations();
		int arg1 = 10;
		int arg2 = 20;
		System.out.print("Values before addition arg1: " +arg1+" and arg2: " +arg2);
		Integer result = cal.add(arg1,arg2);
		System.out.println("Result: " + result);
	}
}
