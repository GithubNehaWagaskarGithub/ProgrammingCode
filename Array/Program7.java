package Array;

public class Program7 {
	public static void main(String[] args) {
		int[] arr= {10,11,12,13,14,15,16};
		int sum=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			sum+=arr[i];
			
		}
		System.out.println(sum);
	}
}
