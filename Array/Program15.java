package Array;

public class Program15 {
	public static void main(String[] args) {
		int[] arr=RandomArray4.getArray(5);//Array in ascending order

		int max=0;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(arr[j]<arr[i])
				{
					max=arr[i];
					arr[i]=arr[j];
					arr[j]=max;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
