package String;

import java.util.ArrayList;
import java.util.List;

public class Program31 {
	public static void main(String[] args) {//VVVVVVVVVVIMP
		String str="D1:G3";
		List<String> rows=selectedRows(str);
		System.out.println(rows);
	}
	
	public static List<String>selectedRows(String str)
	{
		List<String> ans=new ArrayList<>();
		char st=str.charAt(0);
		char ed=str.charAt(3);
		while(st<=ed)
		{
			char nst=str.charAt(1);
			char ned=str.charAt(4);
			while(nst<=ned)
			{
				ans.add(st+""+nst);
				nst++;
			}
			st++;
		}
		return ans;
	}
}
