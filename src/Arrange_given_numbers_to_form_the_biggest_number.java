import java.util.*;
public class Arrange_given_numbers_to_form_the_biggest_number  {
	 public static void main (String[] args) {
         Vector<String> arr= new Vector<>();
       arr.add("54");
       arr.add("546");
       arr.add("548");
       arr.add("60");
       printLargest(arr);
       }
	  static void printLargest(Vector<String> arr){
		    Collections.sort(arr , new Comparator<String>(){
	        public int compare(String X, String Y) {
	       // String XY=X + Y; /*these 3 lines are given by geeksforgeeks*/
	        //String YX=Y + X;
	        //return XY.compareTo(YX) > 0 ? -1:1;
	        return Y.compareTo(X); //this line will also give the same result as above 3 lines(i.e acc. to quesn)
	        }
	    });
	    Iterator<String> it = arr.iterator();
	    while(it.hasNext())
	        System.out.print(it.next());
	  } 
}

