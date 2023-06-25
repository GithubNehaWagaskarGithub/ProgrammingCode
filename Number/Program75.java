package Number;

public class Program75 {
	public static void main(String[] args) {
		int b=1;
		int c=0;
		while(c<13)
			{
				int a=b;
				int sum=0;
				int mul=1;
				while(a!=0)
				{
					int r=a%10;
					sum+=r;
					mul*=r;
					a=a/10;
				}
				if(sum==mul)
				{
					System.out.println(b);
					c++;
				}
				b++;
			}
		}
	
	}
