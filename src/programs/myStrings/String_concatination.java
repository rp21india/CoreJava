package programs.myStrings;
//TIME-O(n)......Space-O(1)
public class String_concatination {
	 public static void main(String[] args) {
		String s1="abe";
		String s2="cdfhg";
		String s=new String();
		if(s1.length() == s2.length()){
		for(int i=0;i<s1.length() || i<s2.length();i++){
			s+=s1.charAt(i);
			s+=s2.charAt(i);
		}
		}
		else if(s1.length() > s2.length()){
			for(int i=0;i<s1.length();i++){
				s+=s1.charAt(i);
				if(i<s2.length())
				s+=s2.charAt(i);
			}
		}
		else if(s1.length() < s2.length()){
			for(int i=0;i<s2.length();i++){
				if(i<s1.length())
				s+=s1.charAt(i);
				s+=s2.charAt(i);
			}
		}
		 System.out.println(s);
  }
}
