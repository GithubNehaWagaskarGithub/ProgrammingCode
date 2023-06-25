package Patterns;

public class Pattern196 {
	public static void main(String[] args) {
		int line=7;
		int space=3;
		int star=1;
		char ch='A';
		for(int i=0;i<line;i++)
		{
			char ch1=ch;
			for(int k=0;k<space;k++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print(ch1+" ");
				if(j<i)
				{
					ch1--;
				}
				else
				{
					ch1++;
				}
			}
			System.out.println();
			
			if(i<3)
			{
				star+=2;
				space--;
				ch++;
			}
			else
			{
				star-=2;
				space++;
				ch--;
			}
		}
	}
}
