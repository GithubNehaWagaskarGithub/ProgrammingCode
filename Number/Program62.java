package Number;

public class Program62 {
	public static void main(String[] args) {
		int a=123;
		while(a!=0)
		{
			int r=a%10;
			System.out.print(r);
			a/=10;
		}
	}
}
