package Patterns;

public class Pattern154 {
	public static void main(String[] args) {
		int line=5;
		int star=5;
		
		for(int i=0;i<line ;i++)
		{
			char ch='A';
			for(int j=0;j<star;j++)
			{
				if(i==0 || i==2 || i==4)
				System.out.print("* ");
				
				else
					System.out.print(ch++ +" ");
				
			}
			System.out.println();
			star--;
			if(i%2==0)
			ch++;
		}
	}
}
