package Patterns;

public class Pattern241 {
	public static void main(String[] args) {
		int line=7;
		int star=1;
		int space=6;
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				System.out.print("* ");
			}
			for(int k=0;k<space;k++)
			{ 
				System.out.print("  ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i<3)
			{
				star++;
				space-=2;;
			}else {
				star--;
				space+=2;
			}	
		}
	}
}
