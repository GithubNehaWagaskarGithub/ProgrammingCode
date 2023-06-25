package String;

public class Program43 {
	public static void main(String[] args) {
		String str="123456789";
		int sum=0;
	
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			int a=Integer.parseInt(c+"");
			sum+=a;
		}
		System.out.println(sum);
	}
}