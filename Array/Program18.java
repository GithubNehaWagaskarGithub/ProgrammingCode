package Array;

public class Program18 {
	public static void main(String[] args) {
		int[] arr= {10,1,0,-2};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		
		System.out.println("Minimum element is :"+min);
		
		int minInd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[minInd]>arr[i])
			{
				minInd=i;
			}
		}
		System.out.println("Minimum element index value is :"+minInd);
		
		int temp=arr[minInd];
		arr[minInd]=arr[0];
		arr[0]=temp;
		
		for(int a:arr)
		{
			System.out.print(a+"  ");
		}
	}	
}
