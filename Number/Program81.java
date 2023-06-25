package Number;

public class Program81 {
	public static void main(String[] args) {//there is only 3 neon numbers they are 0,1,9
		int a=1;                            //9*9=81  == 8+1=9 is the neon Number 
		int sum=0;
		int sq=a*a;
		while(sq!=0)
		{
			int r=sq%10;
			sum+=r;
			sq/=10;
			
		}
		if(sum==a)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not a Neon Number");
		}
		
	}
}
