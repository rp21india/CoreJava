
public class Pythagorean_Triplet {

	public static void main(String[] args) {
		int arr[]= {3,4,6,5};
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				for(int k=i+2;k<arr.length;k++)
					if(arr[i]*arr[i]+arr[j]*arr[j]==arr[k]*arr[k])
						System.out.println("true");
					

	}

}
