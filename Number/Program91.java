package Number;

public class Program91 {
	public static void main(String[] args) {//Armstrong Number
		int a=153;
		int sum=0;
		while(a!=0)
		{
			int r=a%10;
			sum+=(r*r*r);
			a/=10;
		}
		
		System.out.println(sum);
	}
}
