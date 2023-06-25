package Patterns;

public class Pattern195 {
	public static void main(String[] args) {
		int line=4;
		int star=1;
		int space=3;
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
					ch1--;
				else
					ch1++;
			}
			System.out.println();
			space--;
			star+=2;
			ch++;
		}
	}
}
