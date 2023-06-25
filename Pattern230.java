package Patterns;

public class Pattern230 {
	public static void main(String[] args) {
		int line=9;
		int space=4;
		int star=1;
		char ch='A';
		for(int i=0;i<line;i++)
		{
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			if(i<4)
			{
				star++;
				space--;
				ch++;
			}
			else
			{
				star--;
				space++;
				ch--;
			}
		}
		
	}
}
