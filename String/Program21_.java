package String;

public class Program21_ {
	public static void main(String[] args) {
		String str="ab aa ba aa ab";
		String revstr="";
		String[] arr=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			revstr+=arr[i]+" ";
		}
		System.out.println(revstr);
		revstr=revstr.trim();//delete the last space
		
		
		if(str.equals(revstr)) 
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("String is Not Pallindrome");
		}
	}
}
