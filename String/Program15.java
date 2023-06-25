package String;

public class Program15 {
	public static void main(String[] args) {
		String str="Core";
		int line=str.length();
		int star=str.length();
		int ch=0;
		for(int i=0;i<line;i++)
		{
			
			int ch1=ch;
			for(int j=0;j<star;j++)
			{
				System.out.print(ch1++);
				
				if(ch1==str.length())
				{
					ch1=0;
				}
				
			}
			System.out.println();
			ch++;
		}
	}
}
