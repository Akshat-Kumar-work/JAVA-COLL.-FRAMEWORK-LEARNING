import java.util.Arrays;
public class ARRAYCLASS {

    public static void main (String args[]){
        int [] array = {1,2,3,4,5,6,7,8,9};
//arrays class give many method or function to array

//using arrays classs for binary search
int index = Arrays.binarySearch(array, 8);
System.out.println("the index of element 8 is "+ index);

//using arrays class for sorting in array 
Arrays.sort(array);

//using arrays class to fill values 
Arrays.fill(array, 12);
System.out.println(array);


    }
    
}
