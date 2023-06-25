package Number;

public class Program72 {
	public static void main(String[] args) {
		int a=1124;
		int sum=0;
		int mul=1;
		while(a!=0)
		{
			int r=a%10;
			sum+=r;
			mul*=r;
			a=a/10;
		}
		System.out.println(sum+"  "+mul);
	}
}
