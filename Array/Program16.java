package Array;

public class Program16 {
	public static void main(String[] args) { 
		int[] arr=RandomArray5.getArray(5);//Array in descending order
		int min=0;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(arr[j]>arr[i])
				{
					min=arr[i];
					arr[i]=arr[j];
					arr[j]=min;
				}
			}
			System.out.println(arr[i]);
		}
		
	}
}