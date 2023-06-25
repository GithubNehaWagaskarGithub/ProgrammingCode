package Patterns;

public class Program42 {
	public static void main(String[] args) {
		int line =5;
		int star=5;
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(j==0 || j==4 ||i==j)
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
		
		System.out.println ();
		
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(i==0 || j==0 ||i==4 || i==2)
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

		System.out.println();
		
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(j==0 ||j==4 || i==2)
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

		System.out.println();
		int line1=5;
		int star1=1;
		int space1=4;
		for(int i=0;i<line1;i++)
		{
			for(int k=0;k<space1;k++)
			{
				System.out.print(" ");
			}
			for( int j=0;j<star1;j++)
			{
				if((i==2 && j==1)||(i==4 && j==1)||(i==4 && j==2)||(i==4 && j==3))
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
			space1--;
			star1++;
		}
	}
}
