package Patterns;

public class Program10 {
	public static void main(String[] args) {
		
		int line=4;
		int star=4;
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(j==0 || i==3 || i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
