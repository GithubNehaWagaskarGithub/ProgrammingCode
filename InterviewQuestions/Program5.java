package InterviewQuestions;

public class Program5 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int element=30;
		boolean found=false;
		for(int n:arr)
		{
			if(n==element)
			{
				found=true;
			}
		}
		if(found)
		{
			System.out.println("element is Present");
			for(int n:arr)
			{
				System.out.println(n);
			}
		}
		else
		{
			System.out.println("element is Not Present");
		}
	}
}

