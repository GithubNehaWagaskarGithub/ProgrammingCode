package Patterns;

public class Program41 {
	public static void main(String[] args) {
    	int line=5;
		int star=1;
		int space=4;
		for(int i=0;i<line;i++)
		{
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			}
			for( int j=0;j<star;j++)
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
			space--;
			star++;
		}
        System.out.println();
        System.out.println();
        int line1=5;
		int star1=5;
		for(int i=0;i<line1;i++)
		{
			for( int j=0;j<star1;j++)
			{
				if((i==0 && j==0)||(i==0 && j==4)||(i==1 && j==1)||(i==1 && j==3)||(i==2 && j==2)||(i==3 && j==2)||(i==4 && j==2))
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
        for(int i=0;i<line1;i++)
		{
			for( int j=0;j<star1;j++)
			{
				if(i==4||j==0||j==4)
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
        for(int i=0;i<line1;i++)
		{
			for( int j=0;j<star1;j++)
			{
				if(i==0||i==2||i==4||(i==1 && j==0)||(i==3 && j==4))
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
        for(int i=0;i<line1;i++)
		{
			for( int j=0;j<star1;j++)
			{
				if(i==2||j==0||j==4)
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


