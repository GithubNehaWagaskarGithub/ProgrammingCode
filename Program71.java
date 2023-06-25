package Patterns;

public class Program71 {
public static void main(String[] args) {
		
		int line=5;
		int star=5;
		int ch=0;
		for(int i=0;i<line;i++)
		{
			int ch1=ch;
			for(int j=0;j<star;j++)
			{
				if(i==0 || j==0 || i==4 || j==4){
					System.out.print("* ");
				}
				else {
					System.out.print(ch1+" ");
					ch1++;
				}
			}
			System.out.println();
			ch++;
		}
	}
}
