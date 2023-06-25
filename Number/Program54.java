package Number;

public class Program54 {
	public static void main(String[] args) {
		print(10);
	}
	public static void print(int a)
	{
		if(a>0)
		{
			System.out.println(a);
			print(--a);
		}
	}
}
