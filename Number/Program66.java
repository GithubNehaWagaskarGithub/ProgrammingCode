package Number;

public class Program66 {
	public static void main(String[] args) {
		int a=12321;
		int sum=0;
		int temp=a;
		while(a!=0)
		{
			int r=a%10;
			sum=sum*10+r;
			a/=10;
		}
		
		if(sum==temp)
		{
			System.out.println("Number is Pallindrome ");
		}
		else
		{
			System.out.println("Number is Not Pallindrome");
		}
	}
}