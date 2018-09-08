
public class ImmediateSmallerElement {

	public static void main(String[] args) {
		//int arr[]={4,2,1,5,3};
		int arr[]={5,6,2,3,1,7};
		int ar[]=new int[arr.length];
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				ar[i]=arr[i+1];
			}
			else{
				ar[i]=-1;
			}
		}
		ar[arr.length-1]=-1;
		for(int f:ar)
			System.out.print(f+" ");
		
	}

}
