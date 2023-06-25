package Patterns;

public class Program92 {
	public static void main(String[] args) {
		int line=6;
		int star=1;
		int ch=-1;
		for(int i=0;i<line ;i++)
		{
			
			for(int j=0;j<star;j++)
			{
				if(j==0 || i==5 || i==j) {
					System.out.print("* ");
					}
				else
					System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
			star++;
		}
	}
}
