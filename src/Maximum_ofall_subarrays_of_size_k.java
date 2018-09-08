
public class Maximum_ofall_subarrays_of_size_k {
public static void main(String[] args){
	int k=3;
int arr[]= {1,2,3,1,4,5,2,3,6};
for (int i = 0; i <= arr.length-k; i++) {
     int max = arr[i];
   for (int j = 1; j < k; j++) {
        if (arr[i + j] > max)
            max = arr[i + j];
   }
    System.out.print(max + " ");
 }
}		   
}