package Patterns;

public class Program38 {
	public static void main(String[] args) {
		int line=6;
		int star=7;
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(i==0 || i==5 || j==3) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();

		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if((i==1 && j==3) ||(i==0 && j==4)||(i==0 && j==5) || (i==1 && j==6)||
						(i==2 && j==6)||(i==3 && j==5)||(i==4 && j==4)||(i==5 && j==3)||
						(i==0 && j==2)||(i==0 && j==1)||(i==1 && j==0)||(i==2 && j==0)||
						(i==3 && j==1)||(i==4 && j==2))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(j==0 || i==5 || j==6)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}
