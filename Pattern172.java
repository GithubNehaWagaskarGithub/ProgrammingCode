package Patterns;

public class Pattern172 {
	public static void main(String[] args) {
		int line=5;
		int star=1;
		char ch='A';
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++)
			{
				if(i%2==0) {
					System.out.print(ch+" ");
				}
				else
					System.out.print("* ");
			}
			System.out.println();
			if(i%2==0)
				ch++;
			if(i<2) {
				star++;
				
				}
			else
				star--;
		}
	}
}
