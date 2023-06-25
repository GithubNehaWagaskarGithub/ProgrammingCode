package String;

import java.util.Arrays;

public class Program27 {
	public static void main(String[] args) {
		String str="2is 4Batch 1This 3Programming";
		String[] arr=str.split(" ");
		String[] strArr=new String[arr.length];
		String ans=" ";
		for(String s:arr)
		{
			int idx=s.charAt(0)-'0';
			String temp=s.substring(1);
			strArr[idx-1]=temp;
			
		}
		System.out.println(Arrays.toString(strArr));
		
		//System.out.println(ans+=Arrays.toString(strArr));
	}
}
