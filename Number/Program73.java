package Number;

public class Program73 {
	public static void main(String[] args) {
		int a=4291;
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
			System.out.println(sum+"  "+mul);
			System.out.println("SPY Number");
		}
		else
		{
			System.out.println(sum+"  "+mul);
			System.out.println("Not a SPY Number");
		}
	}
}