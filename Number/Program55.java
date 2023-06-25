package Number;

public class Program55 {
	public static void main(String[] args) {
		print(1);
	}
	public static void print(int a)
	{
		if(a<11)
		{
			System.out.println(2*a);
			print(++a);
		}
	}
}
