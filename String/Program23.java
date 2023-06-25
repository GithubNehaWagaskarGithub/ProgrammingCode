package String;

public class Program23 {
	public static void main(String[] args) {
		String str="12345678";
		
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			int ch=str.charAt(i)-'0';
			sum+=ch;
		}
		System.out.println("Sum :"+sum);
		
		
	}
}
