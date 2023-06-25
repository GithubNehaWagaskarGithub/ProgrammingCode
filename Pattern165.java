package Patterns;

public class Pattern165 {
	public static void main(String[] args) {
		int line=5;
		int star=1;
		int ch=5;

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
			if(i<2)
				star++;
			else
				star--;
		}
	}
}
