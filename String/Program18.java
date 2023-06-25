package String;

public class Program18 {
	public static void main(String[] args) {
		String str="ababa";
		System.out.println(str.replace('a','*'));
		System.out.println(str.substring(0,2)+"*"+str.substring(3));
		System.out.println("*"+str.substring(1));
		System.out.println(str.substring(0,4)+"*");
		System.out.println("*"+str.substring(1,4)+"*");
		System.out.println(str.substring(0,1)+"**"+str.substring(3));
		System.out.println(str.substring(0,1)+"***"+str.substring(4));
		System.out.println(str.replace('b','*'));
	}
}
