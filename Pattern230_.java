package Patterns;

public class Pattern230_ {
	public static void main(String[] args) {
		int line=9;
		int space=4;
		int star=1;
		
		for(int i=0;i<line;i++)
		{
			char ch='A';
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			}
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
			if(i<4)
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
		}
		
	}
}
