package weekly_assignment;

public class Assignment4_27thMarch_Q1 {
	public static void main(String[] args) {
        
        int n = 4;
        int first = 0, second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;

            if (next > 100) {
                break; // stop if number exceeds 100
            }

            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}

/*
Q1. Fibonacci Series with Condition
Write a Java program to:
1.	Print Fibonacci series up to n terms 
2.	Stop printing using break if any number in the series becomes greater than 100 
👉 Example:
Input: n = 10
Output: 0 1 1 2 3 5 8 13 21 34 55 89
*/ 
