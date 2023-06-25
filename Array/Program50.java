package Array;

public class Program50 {
	public static void main(String[] args) {
		int[][] arr= {
				{10,11,12},
				{13,14,15},
				{16,17,18}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Transpose Matrix");
		System.out.println();
		
		int[][] arr1=arr;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr1[j][i]+" ");
			}
			System.out.println();
		}
 	}
}
