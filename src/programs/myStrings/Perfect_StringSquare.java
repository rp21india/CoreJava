package programs.myStrings;

public class Perfect_StringSquare {

	public static void main(String[] args) {
		 String str = "d";
	        if (isPerfectSquareString(str))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	}
	
	 static boolean isPerfectSquareString(String str) {
	        int sum = 0;
	        int len = str.length();
	        for (int i = 0; i < len; i++)
	            sum += (int)str.charAt(i);
	        long squareRoot = (long)Math.sqrt(sum);
	        System.out.println(squareRoot);
	        System.out.println(Math.floor(squareRoot));
	        return ((squareRoot - Math.floor(squareRoot)) == 0);
	    }

}
