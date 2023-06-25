package Patterns;

public class Pattern170 {
	public static void main(String[] args) {
		int line=9;
		int star=1;
		int ch=1;
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			if(i<4)
			{
				star++;
				ch++;
			}
			else
			{
				star--;
				ch--;
			}
		}
	}
}
