package programs.myStrings;

public class Even_position_StringReverse_Thisismycountry {
	    public static void main (String[] args) {
	    String str="This is my Country";
	    String arr[]=str.split(" ");
	   for(int i=0;i<arr.length;i++) {
	    if(i==0 || i%2==0) {
	    	char[] c1=arr[i].toCharArray();
	    	int k=c1.length-1;
	    	for(int j=0;j<k;j++,k--) { 
	             char temp=c1[j];
	    		c1[j]=c1[k];
	    		c1[k]=temp;
	    	}
	    	String s1=new String(c1);
	    	arr[i]=s1;
	    }
	   }
	 for(int i=0;i<arr.length;i++) 
	System.out.print(arr[i]+" ");
	}
}