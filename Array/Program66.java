package Array;

import java.util.Scanner;

public class Program66 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr= {{10,20,30},
					{40,50,60},
					{70,80,90}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}