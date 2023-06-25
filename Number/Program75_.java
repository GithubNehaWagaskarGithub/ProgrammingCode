package Number;

public class Program75_ {
	public static void main(String[] args) {
		int count=0;
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
				count++;
			}
		}
		System.out.println("Total spy number from 1 to 1000 :"+count);
	}
}
