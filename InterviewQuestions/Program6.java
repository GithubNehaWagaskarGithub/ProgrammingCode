package InterviewQuestions;

public class Program6 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even Numbers from Array :");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("Odd Numbers from Array :");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				System.out.println(arr[i]);
			}
		}
	}

}