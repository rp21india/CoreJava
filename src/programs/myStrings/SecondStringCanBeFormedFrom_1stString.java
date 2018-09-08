package programs.myStrings;

public class SecondStringCanBeFormedFrom_1stString {

	public static void main(String[] args) {
		String str1="GeeksforGeeks";
		String str2="sekes";
		System.out.print(canMakeStr2(str1,str2));
	}
   static boolean canMakeStr2(String str1,String str2){
	  int count[]=new int[256];
	  for(int i=0;i<str1.length();i++){
		  count[str1.charAt(i)]++;
	  }
	  for(int i=0;i<str2.length();i++){
		  if(count[str2.charAt(i)]==0)
			  return false;
		  count[str2.charAt(i)]--;
	  }
	  return true;
  }
}
