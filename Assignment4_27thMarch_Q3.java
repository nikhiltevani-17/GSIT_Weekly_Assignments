package weekly_assignment;

public class Assignment4_27thMarch_Q3{
	public static void main(String[] args) {
		int num = 57243;
		String newNum="";
		int pos=0;
		while(num>0)
		{
			pos++;
			int lastDigit=num%10;
			if(pos%2!=0 && lastDigit<=4) 
			{
				newNum=newNum+""+lastDigit*2;
			}
			else if(pos%2!=0 && lastDigit>4)
			{
				newNum=newNum+""+lastDigit;			
			}
			else if(pos%2==0)
			{
				newNum=newNum+""+1;
			}
			num=num/10;	
		}
		System.out.println(newNum);
		StringBuilder sb= new StringBuilder(newNum);
		sb.reverse();
	//	System.out.println(sb);
		int output = Integer.parseInt(sb+"");
		System.out.println(output);
		
	}

}


/*
Q3. Digit Transformation Logic (Advanced)
Write a program to:
1.	Take a number n 
2.	Traverse digits from right to left 
3.	Apply following rules: 
o	If digit is at odd place  AND digit ≤ 4 → multiply by 2 
o	If digit is at even place→ replace with 1 
o	Else keep at it is i.e digit at odd place and >4
4.	Form a new number from the result 
👉 Example:
Input: n = 57243
Step-by-step:
Position (right se):
•	3 (pos 1, odd ≤4) → 6 
•	4 (2nd place,even) → 1 
•	2 (3rd , odd place and less than <=4) → 4 
•	7 (4th place,even) → 1
•	5 (5th place,odd but is >=5) → 5
Output: 51416

 */


