package Array;

public class Program67 {
	public static void main(String[] args) {
		int[][] bank= {{9000,3000,9000},
						{5000,6000,7000},
						{8000,9000,1000}};
		int maxsum=0;
		int customer=0;
		for(int i=0;i<bank.length;i++)
		{
			int sum=0;
			for(int j=0;j<bank.length;j++)
			{
				sum+=bank[i][j];
			}
			System.out.println(sum);
			if(sum>maxsum)
			{
				maxsum=sum;
				customer=i;
			}
		}
		System.out.println("MaxSum :"+maxsum);
		System.out.println("Customer :"+customer+1);
	}
}
