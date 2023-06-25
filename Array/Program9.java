package Array;

public class Program9{
	public static void main(String[] args) {
		int[] arr= {10,11,12,13,14,15,16};
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			System.out.println(i+"="+arr[i]);
		}
	}
}