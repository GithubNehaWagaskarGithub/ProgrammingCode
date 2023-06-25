package Number;

public class Program22 {
	public static void main(String[] args) {
		int a=6;
		int sum=0;
		for(int i=1;i<6;i++)
		{
			
			if(a%i==0)
			{
				sum+=i;
			}
		}
		System.out.println("sum :"+sum);
		if(sum==a)
		{
			System.out.println("Number is Perfect");
		}
		else
		{
			System.out.println("Number is not Perfect");
		}

    }
}
