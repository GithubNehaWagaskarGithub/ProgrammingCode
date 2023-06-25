package Patterns;

public class Program78 {
	public static void main(String[] args) {
		int line=5;
		int star=5;
		//int ch=0;
		for(int i=0;i<line;i++)
		{
			//int ch1=ch;
			for(int j=0;j<star;j++)
			{
				if((i+j)%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
