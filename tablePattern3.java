package Patterns;

public class tablePattern3 {
	public static void main(String[] args) {
		int line=4;
		int star=4;
		//int k=1;
		int ch=1;
		for(int i=0;i<line;i++)
		{
			int ch1=ch;
			for(int j=0;j<star;j++)
			{
				System.out.print(ch1*ch1+" ");
				ch1++;
			}
			System.out.println();
			
		}
	}
	
}
