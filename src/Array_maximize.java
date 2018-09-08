
public class Array_maximize {
public static void main(String args[]) {
	int arr[]= {1,2,2,2,3,4};//{1,2,3}{1,2,2,3}//array's last element need to be maximum value of 
	int sum = 0;             //array if not than first find maximum value in array than do the
	int n=arr.length;        // following task.
	int x;
	for(int i=n-1;i>=0;i--) {
		sum=sum+arr[i];
		x=arr[i]-1;
		for(int j=0;j<n;j++) {
		 if(arr[j]==x) {
			 arr[j]=0;
		  }
	    }
}
	System.out.println(sum);
	}
}
