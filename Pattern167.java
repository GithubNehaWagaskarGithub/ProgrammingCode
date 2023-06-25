package Patterns;

public class Pattern167 {
	public static void main(String[] args) {
		int line=9;
		int star=1;
		
		for(int i=0;i<line;i++)
		{
			int ch=1;
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
				
				if(j<2)
				{
					ch++;
				}
				else
				{
					ch--;
				}
				
			}
			System.out.println();
			if(i>3)
				star--;
			else
				star++;
		}
	}
}
