package Patterns;

public class Program39 {
	public static void main(String[] args) {
		
		int line=6;
		int star=4;
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(i==0 || i==2 || j==0 || (i==1 && j==3)||(i==3 && j==1)||(i==4 && j==2)||(i==5 && j==3))
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