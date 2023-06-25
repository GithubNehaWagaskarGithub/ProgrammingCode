package Array;

public class Program25 {
	public static void main(String[] args) {
		int[] arr= {11,10,2,3,4};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Bubble Sort :");//compare the adjacent values//bubble sort = I M P
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	
}

