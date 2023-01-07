import java.util.Set;
import java.util.LinkedHashSet;
//import java.util.TreeSet;
//import java.util.HashSet;
public class hashset {

    public static void main (String [] args){
        //Set < Integer> set = new HashSet <> (); //order is not defined
        Set < Integer> set = new LinkedHashSet <> (); //order is acc to enterd element
         //Set < Integer> set = new TreeSet <> (); //order is sorted 
        // to add element in a set
        set.add(1);
        set.add(2);
        set.add(7);
        set.add(4);
        set.add(8);
        set.add(6);
        set.add(6); //can't take same element
        System.out.println(set); 

        //to remove particular  element
        set.remove(4);
        System.out.println(set);

        //to check if a set contatin that element 
        System.out.println(set.contains(2));

        //to check size of set
        System.out.println(set.size());

        //to clear set
        set.clear();
        System.out.println(set);

    }
    
}
