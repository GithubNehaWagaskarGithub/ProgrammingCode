package Array;

public class Program38 {
	public static void main(String[] args) {
		int[][] money= {
				{101,99,500},
				{200,199,299,1000},
				{150,100,90,80,20,20,20}};
		
			int frd=0;
			int maxsum=0;
			for(int i=0;i<money.length;i++)
			{
				int sum=0;
				for(int j=0;j<money[i].length;j++)
				{
					sum+=money[i][j];
	            }
				System.out.println(sum);
	            if(maxsum<sum)
	            {
	                maxsum=sum;
	                frd=i;
	            }
			}
			System.out.println("Frind :"+(frd+1));
			System.out.println("Maximum Money :"+maxsum);
		}
	}
