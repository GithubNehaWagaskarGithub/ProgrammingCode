package Array;

public class Program36 {
	public static void main(String[] args) {
		int[][] arr= {
				{10},
				{11,22,23},
				{44,42},
				{55,60,61,67}};
		for(int[] a1:arr)
		{
			for(int a:a1)
			{
				System.out.print(a+"  ");
			}
			System.out.println();
		}
 	}
}
