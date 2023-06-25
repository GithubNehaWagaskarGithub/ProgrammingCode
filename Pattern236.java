package Patterns;

public class Pattern236 {
	
		public static void main(String[] args) {
			int line=5;
			int star=1;
			char ch='V';
			for(int i=0;i<line;i++)
			{
				char ch1=ch;
				for(int j=0;j<star;j++) 
				{
					System.out.print(ch1+" ");
					if(i-1==j)
					{
						ch1--;
					}
				}
				System.out.println();
				star++;
				ch++;
			}
	}

}
