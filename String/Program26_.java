package String;

public class Program26_ {
	public static void main(String[] args) {
		String str="this is programming batch";
		String[] arr=str.split(" ");
		String ans="";
        for (String s:arr)
        {
           
            String temp=s.toUpperCase();
            char ch=s.toUpperCase().charAt(s.length()-1);
            ans+=s.substring(0,temp.length()-1)+ch+" ";
        }
        System.out.println(ans);
        
	}
}