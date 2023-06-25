package String;

public class Program8 {
	public static void main(String[] args) {
		String str="Program";
		char[] arr=str.toCharArray();
		System.out.println("Actual String :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Reverse String :");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
	
}
