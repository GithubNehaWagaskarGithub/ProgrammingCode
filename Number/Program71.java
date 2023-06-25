package Number;

public class Program71 {
	public static void main(String[] args) {//Spy Number or not := add==multi is same
		int a=2114;
		int sum=0;
		int mul=1;
		while(a!=0)
		{
			int r=a%10;
			sum+=r;
			mul*=r;
			a=a/10;
			System.out.println(a);
		}
		System.out.println(sum+"  "+mul+"");
	}
}
