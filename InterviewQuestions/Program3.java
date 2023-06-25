package InterviewQuestions;

public class Program3 {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		for(int i=1;i<=10;i++)
		{
			System.out.println(n1);
			int a=n1+n2;
			n1=n2;
			n2=a;
		}
	}
}
