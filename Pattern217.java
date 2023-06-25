package Patterns;

public class Pattern217 {
	public static void main(String[] args) {
		int line=5;
		int star=1;
		int space=2;
		
		for(int i=0;i<line;i++)
		{
			for(int k=0;k<space;k++)
			{ 
				System.out.print("  ");
			}
			for(int j=0;j<star;j++)
			{
				if(j==0 || j==star-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			if(i<2)
			{
				star+=2;
				space--;;
			}else {
				star-=2;
				space++;
			}
		}
	}
}
