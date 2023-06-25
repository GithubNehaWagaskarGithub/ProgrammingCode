package Patterns;

public class Program68 {
public static void main(String[] args) {
		
		int line=5;
		int star=5;
		for(int i=0;i<line;i++)
		{
			int ch=1;
			for(int j=0;j<star;j++)
			{
				if(j%2==0){
					System.out.print(ch+" ");
					ch+=2;
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
