package Array;

public class Program42 {
	public static void main(String[] args) {
		int[][] arr=RandomArray11.getArray(5);
		int max=arr[0][0];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Maximum number in 2D-array :"+max);
	}
}
