package Patterns;

public class Program59 {
	public static void main(String[] args) {
		int line=4;
		int star=10;
		int ch=1;
		for(int i=0;i<line;i++)
		{
			int ch1=ch;
			int k=1;
			for(int j=0;j<star;j++)
			{
				System.out.print(ch1*k+" ");
				ch1++;
				k++;
			}
			System.out.println();
		}
	}
}
