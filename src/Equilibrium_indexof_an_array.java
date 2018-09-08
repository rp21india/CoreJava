
public class Equilibrium_indexof_an_array {
	 public static void main(String[] args)
	    {
	    	Equilibrium_indexof_an_array equi = new Equilibrium_indexof_an_array();
	        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
	        int arr_size = arr.length;
	        System.out.println("First equilibrium index is " + equi.equilibrium(arr, arr_size));
	    }
		    int equilibrium(int arr[], int n)
		    {
		        int sum = 0; 
		        int leftsum = 0;
		        for (int i = 0; i < n; ++i) 
		            sum += arr[i];
		 
		        for (int j = 0; j< n; ++j) {
		            sum -= arr[j]; 
		            if (leftsum == sum)
		                return j;
		            leftsum += arr[j];
		        }
		        return -1;
		    }
		   
		}