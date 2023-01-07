import java.util.Collections;
import java.util.ArrayList;
public class COLLclass {

    public static void main (String [] args){
        ArrayList <Integer> num = new ArrayList<>();
        num.add(3);
        num.add(2);
        num.add(1);
        num.add(4);
        num.add(58);
        num.add(6);

        //to check minimum element in the list 
        System.out.println(Collections.min(num));

        //to check maximun element in the list 
        System.out.println(Collections.max(num));

        //to check how many time a element is repeating or frequency
        System.out.println(Collections.frequency(num, 5));

        //to sort a list
        Collections.sort(num);
        System.out.println(num);


    }
    
}
