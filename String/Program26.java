package String;

public class Program26 {
	public static void main(String[] args) {
		String str="this is programming batch";
		String[] arr=str.split(" ");
		String ans="";
        for (String s:arr)
        {
           
            String temp=s.toUpperCase();
            char ch=s.toUpperCase().charAt(0);
            ans+=ch+s.substring(1)+" ";
        }
        System.out.println(ans);
        
	}
}