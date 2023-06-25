package Number;

public class Program69 {
	public static void main(String[] args) {
		int count=0;
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
					count++;
				}
		}
		System.out.println("Total Pallindrome from 100 to 1000000 is : "+count);
	}
}