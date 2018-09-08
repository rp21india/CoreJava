public class dlt_element_array {
  public static void main(String[] args) {
	  int flag=1,loc=0;
      int a[]={10,20,30,40,50,60};
	  int n=a.length;
	  int x=50;
	 for (int i = 0; i < n; i++) 
		     {
		            if(a[i] == x)
		            {
		                flag =1;
		                loc = i;
		                break;
		            }
		            else
		            {
		                flag = 0;
		            }
		        }
		        if(flag == 1)
		        {
		            for(int i = loc+1; i < n; i++)
		            {
		                a[i-1] = a[i];
		            }
		            System.out.print("After Deleting:");
		            for (int i = 0; i < n-2; i++) 
		            {
		                System.out.print(a[i]+",");
		            }
	}
  }
  }
