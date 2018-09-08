
public class Find_missing_number_inaArray {
 public static void main(String args[]) {
	int arr[]= {1,2,3,4,5,6,7,8,10};
	  for(int k=0;k<arr.length-1;k++) {
		  if(arr[k]+1==arr[k+1]) {}
		  else {
			  System.out.println(arr[k]+1);
		  }
	  }
	 
	 }
 }