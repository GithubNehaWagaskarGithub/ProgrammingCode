package Array;

public class Program13 {
	public static void main(String[] args) {
		int[] arr=RandomArray2.getArray(5);
		int max=arr[0];
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Number :"+max);
	}
}