
public class Elements_withleftside_Smaller_and_rightside_greater {
public static void main(String args[]) {
	int arr[]= {4,3,2,7,8,9};
		int n=arr.length;
		System.out.print(sortaccqns(arr,n));

}
static int sortaccqns(int arr[],int n) {
for(int i=0;i<n;i++) {
	int flag=0;
	for(int j=0;j<i;j++)
		if(arr[j]>=arr[i]) {
			flag=1;
			break;
		}
	for(int j=i+1;j<n;j++)
		if(arr[j]<=arr[i]) {
			flag=1;
			break;
		}
	if(flag==0)
		return arr[i];
}
	return -1;
	
}
}
