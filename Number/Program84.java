package Number;

public class Program84 {
	public static void main(String[] args) {
		int b=0;
		int c=0;
		while(c<3)
		{
			int a=b;
			int sq=a*a;
			int sum=0;
			while(sq!=0)
			{
				int r=sq%10;
				sum+=r;
				sq/=10;
			}
			if(a==sum)
			{
				System.out.println(sum);
				c++;
			}
			b++;
		}
	}
}
