package programs.myStrings;


public class Hellothere_remove_llo {

public static void main(String[] args) {
StringBuilder str1=new StringBuilder("Hello there");
StringBuilder str2=new StringBuilder("llo");
int a=0;
 for(int j=0;j<str1.length();j++) {
	 if(a<str2.length())
	 if((str2.charAt(a))==(str1.charAt(j))) {
		 str1.deleteCharAt(j);
		 a++;
		 j--;
	 } 
}
 System.out.println(str1);
}
}
