package String;

public class Program22 {
	public static void main(String[] args) {
		String str="TicTak";
		int line=3;
		int star=2;
		int ch=0;
		for(int i=0;i<line;i++)
		{
			int ch1=ch;
			for(int j=0;j<star;j++)
			{
				System.out.print(str.charAt(ch1++));
				ch1+=2;
			}
			System.out.println();
			ch++;
			star+=2;
		}
	}
}