package Array;

public class Program20 {
	public static void main(String[] args) {
		int[] arr= {10,5,-3,0,3,-8};
		
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
			System.out.println("Min Ind :"+minInd);
			
			int temp=arr[j];
			arr[j]=arr[minInd];
			arr[minInd]=temp;
		}
		
		for(int a:arr)
		{
			System.out.print(a+"  ");
		}
	}
}
