package Number;

public class Program61 {
	public static void main(String[] args) {//Pallindrome Number
		int a=123;
		while(a!=0)
		{
			int r=a%10;
			System.out.println(r);
			a/=10;
		}
		
	}
}
