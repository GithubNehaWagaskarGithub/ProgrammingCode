package String;

public class Program24 {
	public static void main(String[] args) 
	{
		String str="123456789";
		
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int a=Integer.parseInt(ch+"");
			sum+=a;
		}
		System.out.println("Sum :"+sum);
	}
}
