package weekly_assignment;

public class Assignment3_20thMarch_Problem1 {
	public static void main(String[] args) {
	        
	        char ch = 'A';

	        // Char to Int (ASCII)
	        int asciiValue = ch;

	        // Add 5
	        int newAscii = asciiValue + 5;

	        // Int to Char
	        char newChar = (char) newAscii;

	        System.out.println("ASCII value: " + asciiValue);
	        System.out.println("New ASCII value: " + newAscii);
	        System.out.println("New character: " + newChar);
	    
			}
	    }


/*
 Problem 1: Student Marks Conversion System
Problem Statement:
A student scored 87.6 marks in an exam (stored in a float). Perform the following operations:

Convert the float marks into:
double
int
Print all three values.
Convert the final integer value into a character using ASCII and print it.

Expected Learning:

Float â†’ Double (Upcasting)
Double â†’ Int (Downcasting)
Int â†’ Char (ASCII conversion)

Sample Output:

Float value: 87.6  
Double value: 87.6  
Integer value: 87  
Character value: W*/