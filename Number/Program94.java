package Number;

public class Program94 {
	public static void main(String[] args) {
		for(int i=1;i<1000;i++)
		{
			int a=i;
			int temp=a;
			int dCount=0;
			int b=a;
			int sum=0;
			while(temp!=0)
			{
				temp/=10;
				dCount++;
			}
			while(a!=0)
			{
				int r=a%10;
				int pow=1;
				for(int j=0;j<dCount;j++)
				{
					pow*=r;
				}
				sum=sum+pow;
				a/=10;
			}
			if(sum==i)
			{
				System.out.println(sum);
			}
		}
	}
}
