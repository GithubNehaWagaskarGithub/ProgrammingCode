package Patterns;

public class Pattern166 {
	public static void main(String[] args) {
		int line=5;
		int star=1;
		
		for(int i=0;i<line;i++)
		{
			int ch=5;
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
			
			if(i<2)
				star++;
			else
				star--;
		}
	}
}
