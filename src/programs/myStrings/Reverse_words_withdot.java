package programs.myStrings;
import java.util.*;
	import java.lang.*;
	import java.io.*;
public class Reverse_words_withdot {
	public static void main (String[] args) {
		String str="I.like.this.program.very.much";
		String[] arr=str.split("\\.");
		int n=arr.length;
		System.out.println(n);
		for(int i=n-1;i>=0;i--){
		  if(i !=0)
		    System.out.print(arr[i]+".");
		 else
		     System.out.print(arr[i]);
		}
	}
}
