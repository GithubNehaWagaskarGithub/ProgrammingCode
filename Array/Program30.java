package Array;

public class Program30 {
	public static void main(String[] args) {
		int[] arr=RandomArray9.getArray(5);
		{
			int min1=arr[0];
			int min2=arr[1];
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
				if(arr[i]<min1)
				{
					min2=min1;
					min1=arr[i];
				}
				else if(arr[i]<min2)
				{
					min2=arr[i];
				}
			}
			System.out.println("Minimum Number in array :"+min1);
			System.out.println("Second Minimum Number in array :"+min2);
		}
	}
}
