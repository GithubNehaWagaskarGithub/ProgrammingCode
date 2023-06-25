package Number;

public class Program44 {
	public static void main(String[] args) {
		fabonacii(0);
	}
	static int n1=0;
	static int n2=1;
	public static void fabonacii(int b)
	{
		if(b<10)
		{
			System.out.println(n1);
			int a=n1+n2;
			n1=n2;
			n2=a;
			fabonacii(++b);
		}
	}
}
