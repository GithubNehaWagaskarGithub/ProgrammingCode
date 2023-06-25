package Array;

import java.util.Scanner;

public class Program60 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int max=arr[0];
		System.out.println("Enter a element :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Max :"+max);
	}
}
