package Number;

public class Program93 {
	public static void main(String[] args) {
		int a=153;
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
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}
}