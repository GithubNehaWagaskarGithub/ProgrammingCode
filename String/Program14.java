package String;

public class Program14 {
	public static void main(String[] args) {
		String str="Program";
		int line=str.length();
		int star=str.length();
		int ch=0;
		for(int i=0;i<line;i++)
		{
			String s="";
			int ch1=ch;
			for(int j=0;j<star;j++)
			{
				s+=str.charAt(ch1++);
				if(ch1==str.length())
				{
					ch1=0;
				}
			}
			System.out.println(s);
			ch++;
		}
	}
}
