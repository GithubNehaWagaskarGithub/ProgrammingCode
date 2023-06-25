package String;

public class Program26__ {
	public static void main(String[] args) {
		String str="this is programming batch";
		String str2="";
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			String str1=arr[i];
			String temp=str1.toUpperCase();
			str2+=str1.substring(0,str1.length()-1)+temp.charAt(str1.length()-1)+" ";
		}
		System.out.println(str2);
	}
}
