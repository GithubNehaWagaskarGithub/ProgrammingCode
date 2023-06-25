package Array;

public class Program21 {
	public static void main(String[] args) {
		int arr[]=RandomArray7.getArray(5);
		
		for(int j=0;j<arr.length;j++)
		{
			int minInd=j;
			for(int i=j;i<arr.length;i++)
			{
				if(arr[minInd]>arr[i])
				{
					minInd=i;
				}
			}
			int temp=arr[j];
			arr[j]=arr[minInd];
			arr[minInd]=temp;
			
		}
		System.out.println("Sorted Array in ascending order :");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}
}
