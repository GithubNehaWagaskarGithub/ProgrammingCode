package Patterns;

public class Program81 {
	public static void main(String[] args) {
		int line=4;
		int star=1;
		int ch=1;
		for(int i=0;i<line ;i++)
		{
			for(int j=0;j<star;j++)
			{
				System.out.print(ch+" ");
				//ch++;
			}
			System.out.println();
			star++;
		}
	}
}