package Array;

public class Program26 {
	public static void main(String[] args) {
		int[] arr= {10,11,12,13,14};//int arr[]=is also ok //int[] arr=is standard not a rule.
		int last=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)//Placed first element at the second position.Last at the first
		{
			arr[i]=arr[i-1];	
		}
		 arr[0]=last;
		 for(int a:arr)
		 {
			 System.out.println(a); 
		 }
		
	}	
}