package Patterns;

public class Program75 {
public static void main(String[] args) {
		
		int line=5;
		int star=5;
		
		for(int i=0;i<line;i++)
		{
			int ch=1;
			for(int j=0;j<star;j++)
			{
				if(i==0 || j==0 || i==4 || j==4 || j==2){
					System.out.print("* ");
				}
				else {
					System.out.print(ch+" ");
					ch+=2;
				}
			}
			System.out.println();
		}
	}
}
