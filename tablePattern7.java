package Patterns;

public class tablePattern7{
	public static void main(String[] args) {
		int line=10;
		int star=10;
		int k=1;
		for(int i=0;i<line;i++)
		{
			int ch1=1;
			for(int j=0;j<star;j++)
			{
				System.out.print(ch1*k+"  |   ");
				ch1++;
			}
			System.out.println();
			k++;
		}
	}
}
