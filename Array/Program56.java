package Array;

public class Program56 {
	public static void main(String[] args) {
		int[] arr= {100,10,45,64,16,4,9,3,5,50};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]%arr[j]==0)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
				
			}
		}
	}
}
