package Array;

public class Program52 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==70)
				{
					System.out.println(arr[i]+","+arr[j]);//find Pair of array
															//whose sum is 70
				}
				
			}
			
		}
	}
}