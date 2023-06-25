package InterviewQuestions;

public class Program9 {
	public static void main(String[] args) {
		String str="NitiN";
		String sum="";
		for(int i=str.length()-1;i>=0;i--)
		{
			sum+=str.charAt(i);
		}
		System.out.println("Original String :"+str);
		System.out.println("Reverse String :"+sum);
	}
}
