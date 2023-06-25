package Number;

public class Program70_ {
	public static void main(String[] args) {
		int b=1;
		int c=0;
		while(c<5)
		{
			int sum=0;
			int a=b;
			while(a!=0)
			{
				int r=a%10;
				sum=sum*10+r;
				a/=10;
			}
			if(sum==a)
			{
				System.out.println(sum+"yes");
				c++;
			}
			b++;
		}
	}
}