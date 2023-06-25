package Number;

public class Program20 {
	public static void main(String[] args) {//factors of 6
		int a = 6;
		for (int i = 1; i <=6; i++) 
		{
            if (a % i == 0)
            {
                System.out.println(i);
            }
        }
	}
}
