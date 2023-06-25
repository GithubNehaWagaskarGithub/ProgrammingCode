package Number;

public class Program31 {
	public static void main(String[] args) {//Factorial Number
		int num=10;
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact*=i;
		}
		System.out.println(fact);
	}

}