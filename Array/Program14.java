package Array;

public class Program14 {
	public static void main(String[] args) {
		int[] arr=RandomArray3.getArray(5);
		int min=arr[0];
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum Number :"+min);
	}
}