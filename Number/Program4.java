package Number;

public class Program4 {
	public static void main(String[] args) {//Prime Number or not
		int a=13;
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
			System.out.println("Number is Prime :"+a);
		}
		else
		{
			System.out.println("Number is not Prime :"+a);
		}
	}
}
