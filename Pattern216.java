package Patterns;

public class Pattern216 {
	public static void main(String[] args) {
		int line=5;
		int star=1;
		int space=2;
		int ch=1;
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
				ch1++;	
			}
			System.out.println();
			ch++;
			if(i<2)
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
