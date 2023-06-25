package Number;

public class Program63 {
	public static void main(String[] args) {
		int a=1234;
		int sum=0;
		int temp=a;
		while(a!=0)
		{
			int r=a%10;
			sum=sum*10+r;
			a/=10;
		}
		System.out.println(a);
		System.out.println(temp);
		System.out.println("Reverse Number is "+sum);
	}
}