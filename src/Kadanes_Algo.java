

public class Kadanes_Algo {
	public static void main(String[] args) {
		int [] a ={-1,-2,-3,-4};
		System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
}
	static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int min = Integer.MIN_VALUE, max = 0;
 
        for (int i = 0; i < size; i++)
        {
            max = max + a[i];
            if (min < max)
            	min = max;
            if (max < 0)
                max = 0;
        }
        return min;
    }
	
}
