package Array;

import java.util.Random;

public class RandomArray11 {
	static Random rd=new Random();
	public static int[][] getArray(int size)
	{
		int[][] arr=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j]=rd.nextInt(50);
			}
			
		}
		return arr;
	}
}

