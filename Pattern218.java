package Patterns;

public class Pattern218 {
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
				if(j==0 ||j==star-1)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("9 ");
				}
			}
			System.out.println();
			if(i<2)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
		}
	}
}
