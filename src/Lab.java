import java.util.*;
public class Lab {
 public static void main(String[] args) {
	int i,t;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	t=sc.nextInt();
	for(i=0;i<t;i++) {
	 int n,m,j,Psum,Qsum;
	 Psum=0;
	 Qsum=0;
	n=sc.nextInt();
	m=sc.nextInt();
	int P[]=new int[n];
	int Q[]=new int[m];
	for(j=0;j<n;j++) {
		P[j]=sc.nextInt();
		Psum=P[j]+Psum;
	}
	for(j=0;j<m;j++) {
		Q[j]=sc.nextInt();
		Qsum=Q[j]+Qsum;
	}
	if(Psum>Qsum)
	System.out.println("C1\n");
	else
		System.out.println("C2\n");
	}	
 }
}
