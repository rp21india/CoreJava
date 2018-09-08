
class Print_1_Diagonally {
	public static void main(String[] args) {
   int arr[][]=new int [6][6];
   int i=4,j=3;
   int m,n;
   for(m=i,n=j; m >= 0 && n>= 0;m--,n--){
	   arr[m][n]=1;
   }
   for(m=i,n=j;m < arr.length && n < arr.length;m++,n++){
	   arr[m][n]=1;
   }
   
  for(m=i,n=j ;m < arr.length && n >= 0;m++,n--){
	   arr[m][n]=1;
   }
  for(m=i,n=j ;m >= 0 && n < arr.length;m--,n++){
	   arr[m][n]=1;
  }
   for(int a=0;a<arr.length;a++){
	   for(int b=0;b<arr.length;b++){
		   System.out.print(arr[a][b]+" ");
	   }
    System.out.println();
    }
  }
}