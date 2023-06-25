package String;

public class Program42 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,10,40,20,30,10};
		int[] arr1= {0,0,0,0};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		for(int a:arr1)
		{
			System.out.println(a);
		}
	}
}
