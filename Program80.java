package Patterns;

public class Program80 {
	public static void main(String[] args) {
		int line=5;
		int star=5;
		
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(j%2==0)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}
				
			}
			System.out.println();
		}
	}
}
