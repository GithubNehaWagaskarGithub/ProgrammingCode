package Array;

public class Program43 {
	public static void main(String[] args) {
		int[][] arr=RandomArray12.getArray(5);
		int min=arr[0][0];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(min>arr[i][j])
				{
					min=arr[i][j];
				}
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Minimum number in 2D-array :"+min);
	}
}
