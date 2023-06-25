package Patterns;

public class pattern243 {
	public static void main(String[] args) {
		String str="aBcdEfGhiJK";
		String temp;
	//tring str2=str.replace('a','A')+str.replace('B','b')+str.replace('c''b')+str.replace('B','b')+
        for (int i=0;i< str.length();i++)
        {
            //char c=str.charAt(i);
            if(str.charAt(i)>65 && str.charAt(i)<90) 
            {
            	temp=str.toUpperCase();
            	System.out.println(temp);
            }
            
            else if(str.charAt(i)>97 && str.charAt(i)<122)
            {
            	temp=str.toLowerCase();
            	System.out.println(temp);
            }
        }
        
        
	}
}
