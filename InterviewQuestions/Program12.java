package InterviewQuestions;

public class Program12 {
	public static void main(String[] args) {
		int a=12321;
		int temp=a;
		int sum=0;
		while(a!=0)
		{
			int r=a%10;
			sum=sum*10+r;
			a/=10;
		}
		System.out.println("Original Number :"+temp);
		System.out.println("Reverse Number :"+sum);
		
		if(sum==temp)
		{
			System.out.println("Number is Pallindrome");
		}
		else
		{
			System.out.println("Number is Not Pallindrome");
		}
	}
}
