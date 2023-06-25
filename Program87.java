package Patterns;

public class Program87 {
	public static void main(String[] args) {
		int line=5;
		int star=1;
		
		for(int i=0;i<line ;i++)
		{
			int ch=1;
			for(int j=0;j<star;j++)
			{
				if(i%2==0) {
					System.out.print(ch+" ");
					ch++;}
				else
					System.out.print("* ");
			}
			System.out.println();
			star++;
		}
	}
}
