package Array;

public class Program41 {
	public static void main(String[] args) {
		
		/*String[] age={"60","55","65","22","44"};
		String[] names={"A","B","C","D","E"};
		age=names;
		int[] arr=new int[age.length];
		for(int i=0;i<age.length;i++)
		{
			arr[i]=Integer.parseInt(age[i]);
			System.out.println(age[i]);
		}*/
		int[] age={60,55,65,22,44};
		String[] names={"A","B","C","D","E"};
		for(int i=0;i<age.length;i++)
		{
			for(int j=0;j<age.length-1;j++)
			{
				if(age[j]<age[j+1])
				{
					int temp=age[j];
					age[j]=age[j+1];
					age[j+1]=temp;
				}
			}
		}
		for(int a:age)
		{
			System.out.println(a);
		}
		
	}
}
