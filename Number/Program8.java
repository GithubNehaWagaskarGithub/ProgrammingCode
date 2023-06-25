package Number;

public class Program8 {
	public static void main(String[] args) {
		int c=0;
		for(int j=10;j<=150;j++)
		{
			int a=j;
			int count=0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				c++;
			}
		}
		System.out.println("Total Prime number between 10 to 150 is :"+c);
	}
}

