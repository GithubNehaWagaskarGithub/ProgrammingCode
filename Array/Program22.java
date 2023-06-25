package Array;

public class Program22 {
	public static void main(String[] args) {
		int[] arr=RandomArray8.getArray(5);
		for(int j=0;j<arr.length;j++)
		{
			int maxInd=j;
			for(int i=j;i<arr.length;i++)
			{
				if(arr[maxInd]<arr[i])
				{
					maxInd=i;
				}
			}
			int temp=arr[j];
			arr[j]=arr[maxInd];
			arr[maxInd]=temp;
		}
		System.out.println("Sorted array in decending order :");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}
}
