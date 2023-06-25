package Array;

public class Program53 {//@@@@@@@@@@
	public static void main(String[] args) {//Merge Array
		
		int[] arr1= {10,20,30,40};
		int[] arr2= {50,60,70};	
		int[] arr=new Program53().mergeArray(arr1,arr2);//Merge Two array in Third Array
		
		for(int a:arr)
		{
			System.out.print(a+"  ");
		}
	}
	public int[] mergeArray(int[] a1,int[] a2)
	{
		int n1=a1.length;
		int n2=a2.length;
		int[] arr3=new int[n1+n2];
		int idx=0;
		for(int a:a1)
		{
			arr3[idx++]=a;
		}
		for(int a:a2)
		{
			arr3[idx++]=a;
		}
		return arr3;
	}
}
