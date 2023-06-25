package Array;

public class Program55 {
	public static void main(String[] args) {
		int[] arr= {100,10,45,16,4,9,3,5,50};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]%arr[j]==0)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
				
			}
		}
	}
}
