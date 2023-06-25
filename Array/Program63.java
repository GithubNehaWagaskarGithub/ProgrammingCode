package Array;

import java.util.Scanner;

public class Program63 {//element take from end user 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter a element :");
		int max1=arr[0];
		int max2=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2&&arr[i]!=max1)//when two element is same then use this condition
			{
				max2=arr[i];
			}
		}
		System.out.println("Max1 :"+max1);
		System.out.println("Max2 :"+max2);
	}
}
