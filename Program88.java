package Patterns;

public class Program88 {
	public static void main(String[] args) {
		int line=5;
		int star=1;
		int ch=1;
		for(int i=0;i<line ;i++)
		{
			int ch1=ch;
			for(int j=0;j<star;j++)
			{
				if(i%2==0) {
					System.out.print(ch1+" ");
					ch1++;}
				else
					System.out.print("* ");
			}
			System.out.println();
			if(i%2==0)
			{
				ch++;
			}
			star++;
		}
	}
}
