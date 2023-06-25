package String;

public class Program7 {
	public static void main(String[] args) {
		String str="STAR";
		char[] arr=str.toCharArray();
		int line=4;
		int star=4;
		int ch=0;
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<star;j++) 
			{
				System.out.print(arr[ch]+" ");
			}
			System.out.println();
			ch++;
		}
	}
	
	
}
