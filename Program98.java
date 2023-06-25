package Patterns;

public class Program98 {
	public static void main(String[] args) {
		int line=6;
		int star=1;
		
		for(int i=0;i<line ;i++)
		{
			int ch=0;
			for(int j=0;j<star;j++)
			{
				if(j==0 || i==5 || i==j || j==2 || j%2==0)
				{
					System.out.print("* ");
					ch++;
					}
				else  
					System.out.print(ch+" ");
					
			}
			System.out.println();
			star++;
		}
	}
}
