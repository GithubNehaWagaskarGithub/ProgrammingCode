package Number;

public class Program7 {
	public static void main(String[] args) {
		int c=0;
		for(int j=1;j<=100;j++)
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
		System.out.println("Total Prime number between 1 to 100 is :"+c);
	}
}
