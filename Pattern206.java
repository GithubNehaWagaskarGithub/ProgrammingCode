package Patterns;

public class Pattern206 {
	public static void main(String[] args) {
		int line=5;
		int star=1;
		int space=4;
		int ch=4;
		for(int i=0;i<line;i++)
		{
			int ch1=ch;
			for(int k=0;k<space;k++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print(ch1+" ");
				
				if(j<i)
				{
					ch1++;
				}
				else
				{
					ch1++;
				}
			}
			System.out.println();
			star+=2;
			space--;
			ch--;
		}
	}
}
