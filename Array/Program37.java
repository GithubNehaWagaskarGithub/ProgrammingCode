package Array;

public class Program37 {
	public static void main(String[] args) {
		int[][] arr= {
				{10},
				{11,22,23},
				{44,42},
				{55,60,61,67}};
		int min=arr[0][0];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(min>arr[i][j])
				{
					min=arr[i][j];
				}
			}
		}
		System.out.println("Minimum Number is 2D-array :"+min);
		
 	}
}