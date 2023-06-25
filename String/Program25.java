package String;

public class Program25 {
	public static void main(String[] args) {
		String str="this is programming batch";
		String[] s1=str.split(" ");
		String str2="";
		
        for (int i=0;i< s1.length;i++)
        {
            String str1=s1[i];
            String temp=str1.toUpperCase();
            System.out.println(temp.charAt(0)+str1.substring(1, str1.length()));
            str2+=temp.charAt(0)+str1.substring(1, str1.length())+" ";
        }
        System.out.print("String is : "+str2);
    }
}
