package Patterns;

public class Pattern178 {
	public static void main(String[] args) {
		int line=9;
		int star=1;
		
		for(int i=0;i<line;i++)
		{
			char ch='A';
			for(int j=0;j<star;j++)
			{
				if(j%2==0)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print("* ");
				}
				if(j>2)
				{
					ch-=2;
				}
			}
			System.out.println();
			if(i<4)
			{
				star++;
			}
			else
			{
				star--;
			}
			
		}
	}
}
