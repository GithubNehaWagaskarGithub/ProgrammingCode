package Patterns;

public class Pattern122 {
public static void main(String[] args) {
		
		int line=4;
		int star=4;
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				System.out.print("A ");
			}
			System.out.println();
			star--;
		}
	
	}
}
