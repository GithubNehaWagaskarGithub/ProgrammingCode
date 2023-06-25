package Array;

public class Program31 {
	public static void main(String[] args) {
		int[] arr=RandomArray10.getArray(5);
		int max1=arr[0];
		int max2=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2)
			{
				max2=arr[i];
			}
		}
		System.out.println("Maximum Number in array :"+max1);
		System.out.println("Second Maximum Number in array :"+max2);
	}
}
