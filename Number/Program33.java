package Number;

public class Program33 {
	public static void main(String[] args) {
		for(int j=0;j<10;j++)
		{
			int a=j;
			int fact=1;
			for(int i=a;i>=1;i--)
			{
				fact*=i;
			}
			System.out.println(fact);
		}
	}
}