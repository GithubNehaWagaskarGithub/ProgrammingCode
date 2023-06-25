package Patterns;

public class Program20 {
	public static void main(String[] args) {
		
		int line=7;
		int star=7;
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(i==j || i+j==6 || j-i==5 || i+j==11 || i+j==1 || i-j==5)
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
