package Array;

public class Program23 {
	public static void main(String[] args) {
		int[] arr= {11,12,2,3,4};//its for to placed largest element at the end
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	
}

