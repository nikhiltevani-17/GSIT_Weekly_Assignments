package weekly_assignment;
//import java.util.Arrays;

public class Assignment5_3rd_April_Q1_SecondSmallest {

	public static void main(String[] args) {
		int [] arr= {0,3,1,4,2};
		
	//	Arrays.sort(arr);
	//	System.out.println(arr[1]);
		
 	//	System.out.println("Max Value an Integer Take:"+Integer.MAX_VALUE);
		int smallest=Integer.MAX_VALUE;
		int secSmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<smallest)
			{
				
				//secSmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]>smallest && arr[i]<secSmallest)
			{
				secSmallest=arr[i];
			}
		}
		if(secSmallest==Integer.MAX_VALUE)
			System.out.println("Second Smallest dosent exist");
		System.out.println("smallest:"+smallest);
		System.out.println("secSmallest:"+secSmallest);
	}}
		/*for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<secSmallest && arr[i]>smallest)
				secSmallest=arr[i];
		}
		*/   



/*
ðŸ”¹ Q1. Find Second Smallest Element

ðŸ‘‰ Steps:

Take an array of size 6
Traverse and find smallest
Traverse again to find second smallest
Handle case when all elements are same

ðŸ‘‰ Example:
[4, 2, 7, 2, 9, 1] â†’ Output: 2


*/

