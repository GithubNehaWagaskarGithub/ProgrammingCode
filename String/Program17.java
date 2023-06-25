package String;

public class Program17 {
	public static void main(String[] args) {
		String str="CoreJava";
		System.out.println("LowerCase Letters :");//A-Z==65-90
		for(int i=0;i<str.length();i++)
		{
			int a=str.charAt(i);
			if(a>96)
			{
				System.out.println((char)a);//UpCasting 
			}
			
		}
		System.out.println("UpperCas Letters :");//a-z==97-122
		for(int i=0;i<str.length();i++)
		{
			int a=str.charAt(i);
			if(a<97)
			{
				System.out.println((char)a);//UpCasting 
			}
			
		}
	}
}
