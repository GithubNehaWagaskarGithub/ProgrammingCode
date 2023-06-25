package Patterns;

public class Pattern232 {
	public static void main(String[] args) {
		int line=9;
		int space=8;
		int star=1;
		
		for(int i=0;i<line;i++)
		{
			int ch=1;
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			for(int k=0;k<space;k++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			if(i<4)
			{
				star++;
				space-=2;
				
			}
			else
			{
				star--;
				space+=2;
				
			}
		}
		
	}
}
