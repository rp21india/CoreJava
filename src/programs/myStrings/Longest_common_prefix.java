package programs.myStrings;

public class Longest_common_prefix {

	public static void main(String[] args) {
		String arr[]= {"geeksforgeeks","geeks","geek","geezer"};
	    String longestPrefix=getLongestCommonPrefix(arr);
        System.out.println(longestPrefix);
	 }
	 private static String getLongestCommonPrefix(String[] arr) {
		 String str=findMinimum(arr);
		 int minPrefixLength=str.length();
		 for(int i=0;i<arr.length;i++) {
			 int j;
			 for(j=0;j<minPrefixLength;j++) {
				 if(str.charAt(j) != arr[i].charAt(j))
					 break;
			 }
			 if(j<minPrefixLength)
				 minPrefixLength=j;
		 }
		return str.substring(0, minPrefixLength);
	 }
	public static String findMinimum(String arr[]) {
        int arr0_len=arr[0].length();
        String min_len=arr[0];
       for(int i1=1;i1<arr.length;i1++) {
    	   if(arr[i1].length()<min_len.length()) {
    		   min_len=arr[i1];
    	   }
    	}
	 return min_len;
	 }
 }
