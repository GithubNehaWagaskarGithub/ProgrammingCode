package Patterns;

public class Program33 {
	public static void main(String[] args) {
		int line=7;
		int star=1;
		int space=3;
		for(int i=0;i<line;i++)
		{
			for(int k=0;k<space;k++)
			{ 
				System.out.print("  ");
			}
			for(int j=0;j<star;j++)
				if(j<3)
				{
					System.out.print("* ");
					space--;
					star++;
				}
				else
				{
					star--;
					space++;
				}
			
			System.out.println();
			
		}
	}
}

