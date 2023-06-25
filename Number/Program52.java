package Number;

public class Program52 {
	public static void main(String[] args) {
		print(1);
	}
	public static void print(int a)
	{
		if(a<=10)
		{
			System.out.println(a);
			print(++a);
		}
	}
}
