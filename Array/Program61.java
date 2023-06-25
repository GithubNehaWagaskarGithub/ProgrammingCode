package Array;

public class Program61 {
	public static void main(String[] args) {
		int[] arr= {25,3,34,11,27,49,8,52,64,78,10};
		int max1=arr[0];
		int max2=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(max1<arr[i])
			{
				max2=max1;
				max1=arr[i];
			}
			else if(max2<arr[i])
			{
				max2=arr[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);
	}
}