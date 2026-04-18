package weekly_assignment;

public class Assignment5_3rd_April_Q2_CheckSorted {

	static boolean isSorted(int arr[])
	{
		for(int i =0;i<arr.length-1;i++)
		{
			if(arr[i+1]<arr[i])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(isSorted(arr));
		
	}

}

/*
ðQ2. Check if Array is Sorted

ðŸ‘‰ Steps:

Input array
Create method isSorted()
Check ascending order
Return true/false

ðŸ‘‰ Example:
[1, 2, 3, 4] â†’ true
[1, 3, 2] â†’ false

*/
