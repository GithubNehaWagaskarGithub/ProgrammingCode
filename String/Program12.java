package String;

public class Program12 {
	public static void main(String[] args) {
		int line=4;
		int star=4;
		int ch=6;
		for(int i=0;i<line;i++)
		{
			int ch1=ch;
			for(int j=0;j<star;j++)
			{
				System.out.print(ch1+" ");
				ch1--;
			}
			System.out.println();
			ch--;
		}
	}
}
