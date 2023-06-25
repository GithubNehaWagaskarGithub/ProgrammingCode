package String;

public class Program41 {
	public static void main(String[] args) {
		String str="ThisIsProgrammingBatch";
		
		int st=0;
		int ed=0;
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>65 && str.charAt(i)<90)//if(str.charAt(i)<'a')
			{
				st=ed;
				ed=i;
				ans+=str.substring(st,ed)+" ";
			}
			
		}
		System.out.println(ans);
	}
}
