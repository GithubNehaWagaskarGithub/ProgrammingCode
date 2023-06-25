package String;

public class Program9 {
	public static void main(String[] args) {//Pallindrome
		String str="NitiN";
		String revstr="";
		String temp=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		System.out.println(revstr);
		
		if(str.equals(revstr))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}
}
