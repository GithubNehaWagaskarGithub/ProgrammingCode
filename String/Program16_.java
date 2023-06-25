package String;

public class Program16_ {
	public static void main(String [] args){
		
		String str="CoreJava";
	    for(int i=0;i<str.length();i++)
	    {
	    	if(str.charAt(i)>65 && str.charAt(i)<97)
	    	{
	    		System.out.println(str.charAt(i));
			}
		}
	    System.out.println();
	    for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=97)
			{
				System.out.println(str.charAt(i));
			}
		}
	}
}
