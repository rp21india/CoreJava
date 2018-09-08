
class ProgramtoFind_Whether_a_NoIsPowerofTwo {
public static void main(String[] args) {
  int arr[]={1,7,8,129,512,1024,2048,2};
  //op[]={1,0,1,0}
  int ar[]=new int[arr.length];
for(int i=0;i<arr.length;i++){
	if(arr[i]==0)
		ar[i]=0;
	if(arr[i]==1 || arr[i]==2)
		ar[i]=1;
	while(arr[i] != 1){
		if(arr[i] % 2 != 0) {
			ar[i]=0;
			break;
		}
		arr[i]=arr[i]/2;
		if(arr[i]==2){
			ar[i]=1;
		}
	}
}
 for(int y:ar)
	 System.out.print(y+" ");
}
}
/*while (n != 1)
{
if (n % 2 != 0)
    return false;
n = n / 2;
}*/