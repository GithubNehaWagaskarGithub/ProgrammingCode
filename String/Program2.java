package String;

public class Program2 {
	public static void main(String[] args) {
		int line = 4;
        int star = 4;
       //int ch1=0;
        char[] arr= {'S','T','A','R'};
        for (int i=0;i<line;i++) {
            
            for (int j = 0; j < star; j++)
            {
                //System.out.print(arr[ch1] + " ");
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            //ch1++;
        }
    }
}
