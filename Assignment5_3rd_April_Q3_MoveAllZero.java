package weekly_assignment;

public class Assignment5_3rd_April_Q3_MoveAllZero {
	
	static void moveZeros(int arr[])
	{
		int pos=0;//1
		for(int i = 0; i <= arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				int temp = arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
				pos++;
				
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {1,0,3,0,5};
		moveZeros(arr);
		for(int num:arr)
			System.out.print(num+" ");

	}

}


/*
 Q3. Move All Zeros to End

ðŸ‘‰ Steps:

Input array
Move all 0s to end without changing order of others
Do it in-place (no extra array)

ðŸ‘‰ Example:
[1, 0, 3, 0, 5] â†’ [1, 3, 5, 0, 0]
		
		*/
		