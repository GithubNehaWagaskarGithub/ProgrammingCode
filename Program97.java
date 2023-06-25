package Patterns;

public class Program97 {
	public static void main(String[] args) {
		int line=6;
		int star=1;
		
		for(int i=0;i<line ;i++)
		{
			int ch=0;
			for(int j=0;j<star;j++)
			{
				if(j==0 || i==5 || i==j || j==2) {
					System.out.print("* ");
					}
				else
					System.out.print(ch+" ");
					ch++;
			}
			System.out.println();
			
			star++;
		}
	}
}
