package Number;

public class Program10 {
	public static void main(String[] args) {
		int p=1;
		int a=1;
		while(p<=25)
		{
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
				p++;
			}
			a++;
		}
	}
}
