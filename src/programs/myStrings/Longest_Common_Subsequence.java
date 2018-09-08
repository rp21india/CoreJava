package programs.myStrings;

import java.util.Arrays;

public class Longest_Common_Subsequence {
	 public static void main(String[] args){
		    String s1 = "AGGTAB";
		    String s2 = "GXTXAYB";
		    char[] X=s1.toCharArray();
		    char[] Y=s2.toCharArray();
		    int m = X.length;
		    int n = Y.length;
		    System.out.println("Length of LCS is" + " " + lcs( X, Y, m, n ) );
	  }
	static int lcs( char[] X, char[] Y, int m, int n ){
	    int L[][] = new int[m+1][n+1];
	    for (int i=0; i<=m; i++) {
	      for (int j=0; j<=n; j++) {
	        if (i == 0 || j == 0)
	            L[i][j] = 0;
	        else if (X[i-1] == Y[j-1])
	            L[i][j] = L[i-1][j-1] + 1;
	        else
	            L[i][j] = max(L[i-1][j], L[i][j-1]);
	           
	      }
	    }
	 // Following code is used to print LCS
        int index = L[m][n];
        int temp = index;
  
        // Create a character array to store the lcs string
        char[] lcs = new char[index+1];
        //lcs[index] = ''; // Set the terminating character
  
        // Start from the right-most-bottom-most corner and
        // one by one store characters in lcs[]
        int i = m, j = n;
        while (i > 0 && j > 0)
        {
            // If current character in X[] and Y are same, then
            // current character is part of LCS
            if (X[i-1] == Y[j-1]) {
                // Put current character in result
                lcs[index-1] = X[i-1]; 
                // reduce values of i, j and index
                i--; 
                j--; 
                index--;     
            }
  
            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (L[i-1][j] > L[i][j-1])
                i--;
            else
                j--;
        }
  
        // Print the lcs
        System.out.print("LCS of "+Arrays.toString(X)+" and "+Arrays.toString(Y)+" is ");
        for(int k=0;k<=temp;k++)
            System.out.print(lcs[k]);
	  return L[m][n];
  }
	  static int max(int a, int b){
	    return (a > b)? a : b;
	  }
}
