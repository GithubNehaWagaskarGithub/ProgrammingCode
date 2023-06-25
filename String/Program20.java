package String;

public class Program20 {
	public static void main(String[] args) {
		String str="I Am Neha Pandurang Wagaskar";
		String revstr="";
		String[] arr=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			revstr+=arr[i]+" ";
		}
		System.out.println(revstr);
	}

}