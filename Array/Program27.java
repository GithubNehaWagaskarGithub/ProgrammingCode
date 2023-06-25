package Array;

public class Program27 {
	public static void main(String[] args) {
		int[] arr= {10,11,12,13,14};
		int n=3;
		while(n>0)
		{
			int last=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--)
			{
				arr[i]=arr[i-1];	
			}
			arr[0]=last;
			n--;
		}
		for(int a:arr)
		 {
			 System.out.println(a); //Rotation the array
		 }
	}
}
