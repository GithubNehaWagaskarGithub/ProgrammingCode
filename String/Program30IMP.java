package String;

public class Program30IMP {
	public static void main(String[] args) {////VVVVVVVVIMP  Decode the String
		String str="a1c1e1";
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