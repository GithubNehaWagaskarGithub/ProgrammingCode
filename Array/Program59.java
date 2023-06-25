package Array;

import java.util.Scanner;

public class Program59 {//take a array element from end user and perform the
							//addition of them elements
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] subject=new double[5];
		System.out.println("Enter marks");
		for(int i=0;i<subject.length;i++) 
		{
			subject[i]=sc.nextDouble();
		}
		for(int i=0;i<subject.length;i++)
		{
			System.out.print(subject[i]+" ");
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<subject.length;i++)
		{
			sum+=subject[i];
		}
		System.out.println("Sum is :"+sum);
	}
}
