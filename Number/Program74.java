package Number;

public class Program74 {
	public static void main(String[] args) {
		for(int i=1;i<1000;i++)
		{
			int a=i;
			int sum=0;
			int mul=1;
			while(a!=0)
			{
				int r=a%10;
				sum+=r;
				mul*=r;
				a=a/10;
			}
			if(sum==mul)
			{
				
				System.out.println(i);
			}
		}
	}
}
