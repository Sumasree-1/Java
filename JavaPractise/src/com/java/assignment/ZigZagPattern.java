package com.java.assignment;

import java.util.Scanner;

public class ZigZagPattern{
       
	public static void main(String[] args){ 
		
		String str = "PROKARMAISHIRING";
		
		System.out.println("Enter the number of rows: ");
		Scanner scanner = new Scanner(System.in);
        int numrows = scanner.nextInt();
        
        scanner.close();
        
        System.out.println(zigZagConcat(str, numrows)); 
    }
	
    private static String zigZagConcat(String str, int n) 
    { 
  
        // If number of rows is less than equal to 1, pass the 
        if (n <= 1)  
        { 
            return str; 
        } 
  
        StringBuilder result = new StringBuilder(); 
  
        // Iterate rowNum from 0 to n - 1 
        for (int rowNum = 0; rowNum < n; rowNum++)  
        { 
            int i = rowNum; 
            boolean up = true; 
            
            // Iterate i till s.length() - 1 
            while (i < str.length())  
            { 
  
                result = result.append(str.charAt(i)); 
                
                // Check is rowNum is 0 or n - 1 
                if (rowNum == 0 || rowNum == n - 1)  
                { 
                    i = i + (2 * n - 2); 
                } 
                else 
                { 
                    if (up)  
                    { 
                        i = i + (2 * (n - rowNum) - 2); 
                    } 
                    else 
                    { 
                        i = i + rowNum * 2; 
                    } 
                    up ^= true; 
                } 
            } 
        } 
        return result.toString(); 
    } 
  
} 