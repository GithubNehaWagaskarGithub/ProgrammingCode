package Number;

public class Program94__ {
	public static void main(String[] args) 
	{
		for(int i=0;i<10000000;i++)
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
			}
		}
	}
}
