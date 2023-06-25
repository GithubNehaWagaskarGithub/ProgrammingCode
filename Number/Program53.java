package Number;

public class Program53 {
	public static void main(String[] args) {
		print(0);
	}
	public static void print(int a)
	{
		if(a<10)
		{
			System.out.println("Hello");
			print(++a);
		}
	}
}