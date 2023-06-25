package Patterns;

public class Pattern300 {
	
	public static void main(String[] args) {
		int line=5;
		int star=1;
		int space=4;
		int ch=0;
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
					ch1--;
				}
				
			}
			System.out.println();
			space--;
			star+=2;
			ch++;
		}
	}

}