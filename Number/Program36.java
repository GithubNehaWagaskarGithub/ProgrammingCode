package Number;

public class Program36 {
	public static void main(String[] args) {
		factorial(6);
		System.out.println(fact);
	}
	static int fact=1;
	public static void factorial(int a)
	{
		
		if(a>0)
		{
			fact*=a;
			
			factorial(--a);
		}
	}
}
