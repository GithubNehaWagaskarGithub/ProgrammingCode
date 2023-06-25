package Patterns;

public class Pattern231 {
	public static void main(String[] args) {
		int line=9;
		int space=8;
		int star=1;
		int ch=1;
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
			}
			for(int k=0;k<space;k++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			if(i<4)
			{
				star++;
				space-=2;
				ch++;
			}
			else
			{
				star--;
				space+=2;
				ch++;
			}
		}
		
	}
}
