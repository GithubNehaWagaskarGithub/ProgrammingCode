package String;

public class Program29 {
	public static void main(String[] args) {////VVVVVVVVIMP  Decode the String
		String str="a2c3e4";
		String s=str;
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				int n=str.charAt(i)-'0';
				char ch=str.charAt(i-1);
				
				for(int j=0;j<n;j++)
				{
					ch++;
				}
				s=s.substring(0,i)+ch+s.substring(i+1);
				System.out.println(s);
			}
		}
		
	}
}
