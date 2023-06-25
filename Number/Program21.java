package Number;

public class Program21 {
	public static void main(String[] args) {//Perfect Number//addition of factors==num
											//6=1,2,3,6;//6==1+2+3;//6==6;
		int count=0;
		for(int i=1;i<=6;i++)
		{
			int a=6;
			if(a%i==0)
			{
				count++;
			}
		}
		System.out.println("Factors of 6 is :"+count);
	}

}