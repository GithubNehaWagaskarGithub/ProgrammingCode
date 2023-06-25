package Array;

public class Program40{
	public static void main(String[] args) {
		int[][] money= {
				{101,99,500},
				{200,199,299},
				{150,100,90,80,20,20,20}};
		
			int frd=0;
			int minsum=0;
			for(int i=0;i<money.length;i++)
			{
				int sum=0;
				for(int j=0;j<money[i].length;j++)//error
				{
					sum+=money[i][j];
	            }
				System.out.println(sum);
				if(sum<minsum)
	            {
	                minsum=sum;
	                frd=i;
	            }
			}
			System.out.println("Frind :"+(frd+1));
			System.out.println("Maximum Money :"+minsum);
		}
	}
