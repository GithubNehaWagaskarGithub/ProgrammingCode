package String;

public class Program33 {
	public static void main(String[] args) {//VVVVVVVVVIMP
		String str="K1:M3";
		char st=str.charAt(0);
		char ed=str.charAt(3);
		
		while(st<=ed)
		{
			char nst=str.charAt(1);
			char ned=str.charAt(4);
			while(nst<=ned) 
			{
				System.out.print(st+""+nst+"  ");
				nst++;
			}
			System.out.println();
			st++;
		}
	}
}
