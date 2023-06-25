package Number;

public class Program6 {
	public static void main(String[] args) {
		for(int j=1;j<=100;j++)
		{
			int a=j;
			int count=0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a);
			}
		}
	}
}
