package Patterns;

public class Pattern225 {
	public static void main(String[] args) {
		int line=8;
		int star=11;
		int space=4;
		for(int i=0;i<line;i++)
		{
			for(int k=0;k<space;k++)
			{
				System.out.print("");
			}
			for(int j=0;j<star;j++)
			{
				if(i==0 || j==0 || i==7 || j==10)
				{
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
