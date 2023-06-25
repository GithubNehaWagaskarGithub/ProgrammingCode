package Array;

import java.util.Scanner;

public class Program65 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] arr=new char[5];
		System.out.println("Enter a Chracter :");
		char max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(arr[i]);
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Max is :"+max);
	}
}
