package Array;

import java.util.Scanner;

public class Program58 {//checks element is present or not inside array
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {10,20,30,40,50};
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i])
			{
				System.out.print("Element is found");
			}
		}
	}
}