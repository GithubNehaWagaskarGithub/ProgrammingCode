package String;

public class Program11 {
	public static void main(String[] args) {
		String str="PROGRAM";
		
        int line = 7;
        int star = 7;
        int ch1 =0;
        char[] arr= str.toCharArray();//but output will be in character format//this is wrong
        for (int i=0;i<line;i++) {
            int ch2 =ch1;
            for (int j = 0; j <star; j++)
            {
                System.out.print(arr[ch2] + " ");
                ch2++;
               
                if(ch2>6)
                {
                    ch2=0;
                }
            }
            System.out.println();
            ch1++;
         }
	}
}
