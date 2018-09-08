package programs.myStrings;

import java.io.*;
public class _4This_2is_2my_7country {
	    public static void main (String[] args) {
	    String str="This is my Country";
	    String arr[]=str.split(" ");
	    int n;
	    String str1="";
	   for(int i=0;i<arr.length;i++) {
	     n=arr[i].length();
	     System.out.print(n+arr[i]+" ");
	   }
	}
}