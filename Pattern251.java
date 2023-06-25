package Patterns;

public class Pattern251 {
	public static void main(String[] args) {
		int line=5;
        int star=5;
        for(int i=0;i<line;i++)
        {
            for(int j=0;j<star;j++)
            {
                if(i==j || i+j==4 || (i==1&&j==2) ||(i==3&&j==2)||(i==2&&j==1)||(i==2&&j==3) )
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
	}
}
