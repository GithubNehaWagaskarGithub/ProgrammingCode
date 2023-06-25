package String;

import static String.Sort.sort;

public class Program37 {

    public static void main(String[] args) {
        String str1="RACE";
        String str2="CARE";
        if(str1.length()==str2.length())
        {
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();

            sort(arr1);
            System.out.println("---------");
            sort(arr2);

            if(arr1.equals(arr2))
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
