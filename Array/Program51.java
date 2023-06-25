package Array;

public class Program51 {//@@@@@222
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6};    //Check the array is sorted or Not
		boolean output=checkSort(arr);
		
		if(output)
		{
			System.out.println("Sorted");
		}
		else
		{
			System.out.println("Not Sorted");
		}
	}
	public static boolean checkSort(int[]arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				return false;
			}
		}
		return true;
	}
}
