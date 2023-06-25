package Number;

public class Program34 {
	public static void main(String[] args) {
		int count=0;
		for(int j=0;j<10;j++)
		{
			int a=j;
			int fact=1;
			for(int i=a;i>=1;i--)
			{
				fact*=i;
				
			}
			System.out.println(fact);
			count++;
		}
		System.out.println("Total count is :"+count);
	}
}
