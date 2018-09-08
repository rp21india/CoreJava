
public class Sort_anarrayof_0s_1s_and_2s {
 public static void main(String args[]) {
	int arr[]= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};//{64,34,25,12,22,11,90};//{0,1,0};//{0,2,1,2,0};
	for(int h=0;h<arr.length-1;h++)
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			int temp = arr[i];
		    arr[i]=arr[i+1];
		    arr[i+1]=temp;
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
 }
}