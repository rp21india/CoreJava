
public class Subarray_with_given_sum {
 public static void main(String args[]) {
	int arr[]= {1,2,3,4,5,6,7,8,9,10}; //{1,2,3,7,5}
	int sum1=15;//12
	int sum;
	int i,j;
 for(j=0;j<arr.length;j++) {
		sum=0;
	for(i=j;i<arr.length;i++) {
		sum+=arr[i];
		if(sum==sum1) {
			System.out.println((j+1)+"\t"+(i+1));
			break;
		    }else if(sum>sum1) 
			break;
	}
 }
	 
 }
}