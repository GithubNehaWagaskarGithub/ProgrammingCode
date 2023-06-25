package String;

public class Program16 {
	public static void main(String[] args) {//Upper Case Letters from given String
		String str="CoreJava";
		for(int i=0;i<str.length();i++)
		{
			int a=str.charAt(i);
			if(a<97)
			{
				System.out.println("Upper Case Letters of String is :"+(char)a);
			}
		}
	}
}
