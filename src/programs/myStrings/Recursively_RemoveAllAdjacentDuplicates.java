package programs.myStrings;

public class Recursively_RemoveAllAdjacentDuplicates {
	public static void main(String[] args) {
	String str="aaaacddddcappp";
		System.out.println(removeDup(str,str.length()));	
	}
	static String removeDup(String str1, int n){
		char[] str=str1.toCharArray();
	    //int len = strlen(str);
	    int k = 0; // To store index of result
	 
	    // Start from second character and add
	    // unique ones
	    for (int i=1; i< n; i++)
	    {
	        // If different, increment k and add
	        // previous character
	        if (str[i-1] != str[i])
	            str[k++] = str[i-1];
	 
	        else
	            // Keep skipping (removing) characters
	            // while they are same.
	            while (str[i-1] == str[i])
	                i++;
	    }
	 
	    // Add last character and terminator
	    str[k++] = str[i-1];
	    str[k] =  '\0';
	 
	    // Recur for string if there were some removed
	    // character
	    if (k != n)
	        removeDup(str, k);// Shlemial Painter's Algorithm
	 
	    // If all characters were unique
	    else 
	    	return str;
	}
}
