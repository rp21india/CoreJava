package programs.myStrings;

public class FunnyString_DoReverseandCheckASCII_Difference {

	public static void main(String[] args) {
		String str="HKMNPS";
        System.out.println(checkFunny(str));
	}
	static boolean checkFunny(String str){
		int i=1;
		int j=str.length()-2;
		str=str.toLowerCase();
		while(i<=j){
		if((Math.abs(str.charAt(i)-str.charAt(i-1))) != Math.abs((str.charAt(j)-str.charAt(j+1))))
		return false;
		i++;
		j--;
		}
		return true;
	}

}
