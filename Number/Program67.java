package Number;

public class Program67 {
	public static void main(String[] args) {
		
		for(int i=11;i<120;i++)
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