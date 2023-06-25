package Array;

public class Program64 {
	public static void main(String[] args) {
		
		char[] arr= {'a','d','f','t','G','K'};
		System.out.println("Enter a Chracter :");
		char max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Max is :"+max);
	}
}
