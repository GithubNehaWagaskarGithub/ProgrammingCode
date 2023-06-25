package Array;

public class Program19 {
	public static void main(String[] args) {
			int[] arr= {10,1,0,-2,9,4};
			for(int i=0;i<arr.length;i++)
			{
				int minInd=i;
				for(int j=i;j<arr.length;j++)
				{
					if(arr[minInd]>arr[j])
					{
						minInd=j;
					}
				}
				int temp=arr[i];
				arr[i]=arr[minInd];
				arr[minInd]=temp;
			}
			for(int a:arr)
			{
				System.out.print(a+" ");
			}
		}
	}

