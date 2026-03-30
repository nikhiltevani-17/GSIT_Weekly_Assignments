package weekly_assignment;

public class Assignment3_20thMarch_Problem2 {
	public class ASCIIExplorer {
	    public static void main(String[] args) {
	        char ch = 'A';

	        // Char to Int (ASCII)
	        int asciiValue = ch;

	        // Add 5
	        int newAscii = asciiValue + 5;

	        // Int to Char
	        char newChar = (char) newAscii;

	        // Output
	        System.out.println("ASCII value: " + asciiValue);
	        System.out.println("New ASCII value: " + newAscii);
	        System.out.println("New character: " + newChar);
	    }
	}
}

/*
Problem 2: ASCII Explorer

Problem Statement:
Write a Java program that:

Takes a character input from the user (e.g., 'A').
Finds and prints its ASCII value.
Adds 5 to the ASCII value.
Converts the new value back to a character and prints it.

Expected Learning:

Char â†’ Int conversion (ASCII)
Arithmetic operations on ASCII values
Int â†’ Char typecasting

Sample Input:

Enter character: A

Sample Output:

ASCII value: 65  
New ASCII value: 70  
New character: F
*/