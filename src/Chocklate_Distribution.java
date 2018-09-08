import java.util.Arrays;

public class Chocklate_Distribution {
 public static void main(String args[]) {
	 int m=5;
	int arr[]= {3,4,1,9,5,6,7,9,12};
	Arrays.sort(arr);
	int temp[]=new int[m];
	for(int i=0;i<m;i++) {
		if(arr[i]==0 || arr[i]==1) {}
		else {
			temp[i]=arr[i];
		}
	}
	System.out.println(temp[temp.length-1]-temp[0]);
 }
}
