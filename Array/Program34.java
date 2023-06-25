package Array;

public class Program34 {
	public static void main(String[] args) {
		int[][] arr= {
				{10,11,12},
				{13,22,15},
				{16,17,18}};
		int min=arr[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(min>arr[i][j])
				{
					min=arr[i][j];
				}
				
			}
			//System.out.println();
		}
		System.out.println("Minimum Number is 2D-array :"+min);
		
 	}
}
