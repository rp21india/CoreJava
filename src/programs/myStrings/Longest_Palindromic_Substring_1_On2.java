package programs.myStrings;
public class Longest_Palindromic_Substring_1_On2 {
 public static void main(String[] args) {
	 String str = "foeekskeegro";
	 System.out.println("Length is: " +longestPalSubstr(str));
 }
 
 static int longestPalSubstr(String str) {
     int maxLength = 1; // The result (length of LPS)
     int start = 0;
     int len = str.length();
     int low, high;
     for (int i = 1; i < len; i++)  {
         low = i - 1;
         high = i;
         while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
             if (high - low + 1 > maxLength) {
                 start = low;
                 maxLength = high - low + 1;
             }
             low--;
             high++;
         }
         low = i - 1;
         high = i + 1;
         while (low >= 0 && high < len   && str.charAt(low) == str.charAt(high)) {
             if (high - low + 1 > maxLength) {
                 start = low;
                 maxLength = high - low + 1;
             }
             low--;
             high++;
         }
     }
     System.out.println(str.substring( start, start + maxLength ));
     
     return maxLength;
 }
}
