package Number;

public class Program51 {
	public static void main(String[] args) {
		printHello(0);
	}
	public static void printHello(int a)
	{ 
		
		if(a<5)
		{
			System.out.println("Hello");
			printHello(++a);
		}
	}
}
