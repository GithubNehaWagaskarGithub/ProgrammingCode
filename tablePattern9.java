package Patterns;

public class tablePattern9 {
	public static void main(String[] args) {
		int line=4;
		int star=4;
		int ch=1;
		int k=1;
		for(int i=0;i<line;i++)
		{
			int ch1=1;
			for(int j=0;j<star;j++)
			{
				System.out.print(ch1*k+" ");
				ch1++;
			}
			System.out.println();
			ch++;
			k++;
		}
	}
}
