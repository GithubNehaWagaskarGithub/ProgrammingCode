package String;

public class Program32 {
	public static void main(String[] args) {//Chess Bord Example
		String str="B2";
		int ch1=str.charAt(0)-'@';
		int ch2=str.charAt(1)-'0';
		if((ch1+ch2)%2==0)
		{
			System.out.println("White Color");
		}
		else
		{
			System.out.println("Black color");
		}
	}
}