package Number;

public class Program68 {
	public static void main(String[] args) {
		
		for(int i=100;i<1000000;i++)
		{
			int a=i;
			int temp=a;
			int sum=0;
			while(a!=0)
			{
				int r=a%10;
				sum=sum*10+r;
				a/=10;
			}
				if(temp==sum)
				{
					System.out.println(sum);
				}
		}
	}
}
