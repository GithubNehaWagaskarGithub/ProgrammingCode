package String;

public class Program13 {
	public static void main(String[] args) {
		String str="Program";
		int line=str.length();
		int star=str.length();
		int ch=0;
		for(int i=0;i<line;i++)
		{
			int ch1=ch;
			for(int j=0;j<star;j++)
			{
				System.out.print(str.charAt(ch1)+" ");
				ch1++;//output in string format
				if(ch1==str.length())//if(ch1>str.length()-1)both condition is correct
				{
					ch1=0;
				}
			}
			System.out.println();
			ch++;
		}
	}
}
