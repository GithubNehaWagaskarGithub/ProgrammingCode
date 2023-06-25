package Number;

public class Program84_ {
	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<100;i++)
		{
			int a=i;
			int sq=a*a;
			int sum=0;
			while(sq!=0)
			{
				int r=sq%10;
				sum+=r;
				sq/=10;
			}
			if(a==sum)
			{
				System.out.println(sum);
				count++;
			}
		}
		System.out.println("Count of neon number from 0 to 100 :"+count);
	}
}
