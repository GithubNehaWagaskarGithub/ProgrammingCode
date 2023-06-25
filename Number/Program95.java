package Number;

public class Program95 {
	public static void main(String[] args) {//error first 10 amstrong number
		int a=0;
		int c=1;
		while(c<=10)
		{
			//int a=i;
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
				System.out.println(a);
				c++;
			}
			a++;
		}
	}
}
