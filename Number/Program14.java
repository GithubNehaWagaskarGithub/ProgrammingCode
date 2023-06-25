package Number;

public class Program14 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++)
		{
			int a=i;
			if(a%7==0)
			{
				count++;
			}
		}
		System.out.println("Total number divisible by 7 between 1 to 100 is : "+count);
	}
}