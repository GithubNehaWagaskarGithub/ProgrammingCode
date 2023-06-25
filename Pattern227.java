package Patterns;

public class Pattern227 {
	public static void main(String[] args) {
		int line=9;
		int star=1;
		int space=4;
		
		for(int i=0;i<line;i++)
		{
			int ch=1;
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
			if(i>3)
			{
				star--;
				space++;
			}
			else
			{
				star++;
				space--;
			}
		}
	}
}
