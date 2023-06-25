package String;

public class Program3 {
	public static void main(String[] args) {
		String str="STAR";
		
        int line = 4;
        int star = 4;
        char[] arr= str.toCharArray();
        for (int i=0;i<line;i++) {
        
            for (int j = 0; j <star; j++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
         }
     }
}
