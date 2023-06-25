package Number;

public class Program92{
	public static void main(String[] args) {
		int a=1634;
		int sum=0;
		while(a!=0)
		{
			int r=a%10;
			
			sum+=(r*r*r*r);
			a/=10;
		}
		
		System.out.println("Amstrong Number :"+sum);
	}
}
