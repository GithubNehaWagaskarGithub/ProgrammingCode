package Number;

public class Program25 {
	public static void main(String[] args) {
		int c=0 ;
		int a=1 ;
		while(c<4)
		{
			int sum=0;
			for(int i=1;i<a;i++)
				{
					if(a%i==0)
					{
						sum+=i;
					}
				}
				if(sum==a)
				{
					c++;
					System.out.println(sum);
				}
			a++;
		}
	}
}

