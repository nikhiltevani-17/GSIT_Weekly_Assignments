package weekly_assignment;

public class Assignment4_27thMarch_Q2 {
	    public static void main(String[] args) {

	        int n = 60;

	        for (int i = 2; i <= n / 2; i++) 
	        {

	            if (n % i == 0) 
	            { 
	                boolean isPrime = true;

	                for (int j = 2; j < i; j++) {
	                    if (i % j == 0) {
	                        isPrime = false;
	                        break;
	                    }
	                }

	                if (isPrime)
	                {
	                    System.out.print(i + " ");
	                }
	            }
	        }
	    }
	}



/*
Q2. Prime Factors of a Number
Write a program to:
1.	Take a number n 
2.	Print all its prime factors 
3.	Do not print repeated factors (unique only) 
4.	Stop (break) if factor becomes greater than n/2 
👉 Example:
Input: n = 60
Output: 2 3 5
*/