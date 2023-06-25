package String;

public class Program21 {
	public static void main(String[] args) {
		String str="Sir Ayush With Love Falling Am I";
		String revstr="";
		String[] arr=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			revstr+=arr[i]+" ";
		}
		System.out.println(revstr);
	}
}
