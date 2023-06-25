package Patterns;

public class Pattern212 {
	public static void main(String[] args) {
		int line=5;
		int star=1;
		int space=2;
		//int ch=4;
		for(int i=0;i<line;i++)
		{
			int ch=4;
			for(int k=0;k<space;k++)
			{ 
				System.out.print("  ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
				if(j<i)
				{
					ch++;
				}
				else
				{
					ch--;
				}
			}
			System.out.println();
			if(i<2)
			{
				star+=2;
				space--;
				//ch--;
			}
			else 
			{
				star-=2;
				space++;
				//ch++;
			}
		}
	}
}
