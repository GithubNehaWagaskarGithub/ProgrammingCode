package Patterns;

public class Pattern155 {
	public static void main(String[] args) {
		int line=4;
		int star=1;
		int ch=1;
		for(int i=0;i<line ;i++)
		{
			int ch1=ch;
			int n=3;
			for(int j=0;j<star;j++)
			{
				System.out.print(ch1+" ");
				ch1+=n;
				n--;
			}
			System.out.println();
			star++;
			ch++;
		}
	}
}
