package Number;

public class Program94_
{
	public static void main(String[] args)
	{
		int count=0;
		for(int i=0;i<1000;i++)
		{
			int a=i;
			int sum=0;
			int temp=a;
			while(a!=0)
			{
				int r=a%10;
				
				sum+=(r*r*r);
				a/=10;
			}
			if(temp==sum)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total Amstrong Number from 0 to 1000 :"+count);
	}
}
