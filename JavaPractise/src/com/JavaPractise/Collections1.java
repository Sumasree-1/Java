package com.JavaPractise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		setDemo();
//		listDemo();
//		queueDemo();
		mapDemo();
	}
	
	public static void setDemo() {
		Set<String> fruit = new HashSet();
		fruit.add("apple");
		fruit.add("orange");
		fruit.add("mango");
		fruit.add("grape");
		fruit.add("banana");
		fruit.add("apple");
		
//		System.out.println(fruit.size());
//		System.out.println(fruit);
		
//		VAR i = fruit.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		for(String item: fruit) {
//			System.out.println(item);
//		}
		
//		fruit.forEach(x -> System.out.println(x));
		fruit.forEach(System.out::println);
	}
	
	public static void mapDemo() {
		Map<String,Integer> fruitCalories = new HashMap();
		fruitCalories.put("apple",95);
		fruitCalories.put("banana",80);
		fruitCalories.put("orange",55);
		fruitCalories.put("banana",70);
		
//		for(VAR entry: fruitCalories.entrySet()) {
//				System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		fruitCalories.forEach(
				(k,v) -> System.out.println("Friut- " + k + " Calories- "+ v));
	}

}
