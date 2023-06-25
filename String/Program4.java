package String;

public class Program4 {
	public static void main(String[] args) {		
        int line = 4;
        int star = 4;
       
        char[] arr= {'S','T','A','R'};
        for (int i=0;i<line;i++) {
            int ch2 =0;
            for (int j = 0; j <star; j++)
            {
            	
                System.out.print(arr[ch2] + " ");
                ch2++;
                
            }
            System.out.println();
            
        }
        
	}

}
