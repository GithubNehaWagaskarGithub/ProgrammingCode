package Array;

public class Program57 {
	public static void main(String[] args) {//Merge the two array elements into third Array
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6,7};
		int n1=arr1.length;
		int n2=arr2.length;
		int[] arr3=new int[n1+n2];
		int idx=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[idx++]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[idx++]=arr2[i];
		}
		for(int a:arr3)
		{
			System.out.print(a+" ");
		}
		
	}
	
}
