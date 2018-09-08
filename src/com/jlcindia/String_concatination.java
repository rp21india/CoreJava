package com.jlcindia;
import java.util.*;
//TIME-O(n)......Space-O(1)
public class String_concatination {
	 public static void main(String[] args) {
		String str="igeegk";
		int i=0;
		int end=str.length()-1;
		for(i=0; i<str.length() &&  end>=0 ;i++,end--){
			if(str.charAt(i)==str.charAt(end)){
				if(i==str.length()-1 && end==0)
					System.out.print("String is a Palindrome");
			}
			else{
				System.out.println("String is not palindrome");
				break;
			}
		}
		
  }
}
