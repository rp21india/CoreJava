
import java.util.Arrays;
public class Sort_elements_by_frequency {
	static int x=0;
public static void main(String args[]) {
	int a[]= {1,4,1,3,1,6,4,3,1,6,4};
	int b[][]=new int[a.length][2];
    a=sort(a);
	b[x][0]=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]==a[i-1]) {
			b[x][1]=b[x][1]+1;
		}else {
			x++;
			b[x][0]=a[i];
		}
	}
	x++;
	b=sort(b);
	for(int i=0;i<x;i++) {
		for(int j=0;j<=b[i][1];j++) {
			System.out.print(" "+b[i][0]);
		}
	}
	System.out.println();
}
public static int[][] sort(int b[][]){
	int c[]=new int[2];
	for(int i=0;i<x;i++) {
		for(int j=i;j<x;j++) {
			if(b[i][1]<b[j][1]) {
				c=b[i];
				b[i]=b[j];
				b[j]=c;
			}
		}
	}
	return b;
}
public static int[] sort(int a[]){
	for(int i=0;i<a.length;i++) 
		for(int j=0;j<a.length-1;j++) 
          if(a[j]>a[j+1]) {
         int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
	}	
return a;		
}
}