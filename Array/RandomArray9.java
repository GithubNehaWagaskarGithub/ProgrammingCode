package Array;

import java.util.Random;

public class RandomArray9 {
	static Random rd=new Random();
	public static int[] getArray(int size)
	{
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=rd.nextInt(50);
		}
		return arr;
	}
}
