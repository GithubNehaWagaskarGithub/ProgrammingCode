package Patterns;

public class Pattern215 {
	public static void main(String[] args) {
		int line=7;
		int star=1;
		int space=3;
		char ch='A';
		for(int i=0;i<line;i++)
		{
			
			for(int k=0;k<space;k++)
			{ 
				System.out.print("  ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
					
			}
			System.out.println();
			ch++;
			if(i<3)
			{
				star+=2;
				space--;;
			}else {
				star-=2;
				space++;
			}
		}
	}
}
