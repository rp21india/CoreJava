
public class TrappingRain_Water {
public static void main(String args[]) {
	int arr[]= {7,4,0,9};
	int n=arr.length;
	int x=0,y=0,sum=0;
	if(arr[0]<arr[n-1])
		x=arr[0];
	else
		x=arr[n-1];
	for(int i=0;i<n;i++) {
		if(x>arr[i]) {
		 y=x-arr[i];
		sum=sum+y;
	}
	}
	System.out.println(sum);
}
}
