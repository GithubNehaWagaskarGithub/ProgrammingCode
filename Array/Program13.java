package Array;

public class Program13 {
	public static void main(String[] args) {
		int[] arr=RandomArray2.getArray(5);
		int max=arr[0];
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Number :"+max);
	}
}

/*Swap To String values without using Third varible
String a="Neha";
String b="Wagaskar";
a=a+b;
b=a.substring(0,(a.length()-b.length()));
a=a.substring(b.length());
System.out.println(a);
System.out.println(b);*/