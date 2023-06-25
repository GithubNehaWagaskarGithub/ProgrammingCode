package Patterns;

public class Pattern228 {
	public static void main(String[] args) {
		int line=9;
		int star=1;
		int space=4;
		char ch='A';
		for(int i=0;i<line;i++)
		{
			//char ch1='A';
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			} 
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
				//ch++;
			}
			System.out.println();
			ch++;
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
