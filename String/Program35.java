package String;

public class Program35 {
	public static void main(String[] args) {
		String str="QJQJQQJJQQJJ";//QJ,QJ,QQJJ,QQJJ
		int count=0;
		int a=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='Q')
			{
				a++;
			}
			else
			{
				a--;
			}
			if(a==0)
			{
				count++;
			}
		}
		System.out.println("Total balance String is :"+count);
	}
}

