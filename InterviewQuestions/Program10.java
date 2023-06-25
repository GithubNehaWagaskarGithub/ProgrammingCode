package InterviewQuestions;

public class Program10 {
	public static void main(String[] args) {
		String str="NitiN";
		String sum="";
		for(int i=str.length()-1;i>=0;i--)
		{
			sum+=str.charAt(i);
		}
		System.out.println(sum);
		if(str.equals(sum))
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("String is Not a Pallindrome");
		}
	}
}
