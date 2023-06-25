package String;

import static String.Sort.sort;

import java.util.Arrays;

public class Program36 {
	public static void main(String[] args) {
        String str1="MARY";
        String str2="ARMY";
        if(str1.length()==str2.length())
        {
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();

            sort(arr1);
            System.out.println("----------");
            sort(arr2);

            if(Arrays.equals(arr1,arr2))
            {
                System.out.println("String is an anagram");
            }
            else
            {
                System.out.println("String is not an anagram");
            }
        }
        else
        {
            System.out.println("String is not an anagram");
        }
    }
}

