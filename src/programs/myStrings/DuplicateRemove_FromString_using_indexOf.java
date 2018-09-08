package programs.myStrings;

import java.util.*;
public class DuplicateRemove_FromString_using_indexOf {
	    public static void main (String[] args) {
	    String str="geeks for geeks";//"AABBCDDEAA";
	    //ABCDE
	   // System.out.println(str.length());
	    String s1 = new String();
        for (int i = 0; i <str.length(); i++)   {
            char c = str.charAt(i);
           // System.out.println(i+" "+c+" "+s1.indexOf(c));
           if (s1.indexOf(c) < 0) {  //indexOf will check the first occurrence of the specified character,if not present then it will return -1. 
            	s1 =s1+ c;
            	//System.out.println("works");
            }
        }
	   System.out.println(s1);
	}
}

    //USING HASHING
/* class RemoveDuplicates{
    
    void removeDuplicates(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
         
        // print string after deleting duplicate elements
        for(Character ch : lhs)
            System.out.print(ch);
    }
     
    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        RemoveDuplicates r = new RemoveDuplicates();
        r.removeDuplicates(str);
    }
}  */
