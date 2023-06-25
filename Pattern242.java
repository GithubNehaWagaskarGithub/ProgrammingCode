package Patterns;

public class Pattern242 {
	public static void main(String[] args) {
		int[] arr= {10,30,20,30,60,60};
		int max1=arr[0];
		int max2=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]<max2)
			{
				max2=arr[i];
			}
		}
		
		System.out.println("Second Maximum Number :"+max2);
	}
}
