import java.util.ArrayList;
import java.util.List;
public class arraylist{
    public static void main (String [] args ){
        //creating array list 
        List<String> studentName = new ArrayList<>(); //no size is defined 
        //default internal array is size 10
        studentName.add("rakesh"); 

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //to add element acc. to index no. 
        list.add(2,25);
        

        
        List<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);

        //to add a list into other list use ,addall
        list.addAll(list1);  //adding list1 in list 
        System.out.println(list);

        //to get element of particular index no. use .get 
        System.out.println(list.get(2));
        
//to remove element from array list by index  .remove

list.remove(5);
System.out.println(list);


//to remove an element direct by element remove(Integer.valueof(element)) is used

list.remove(Integer.valueOf(100));
System.out.println(list);


//to clear whole list .clear() is use
/*list.clear();
System.out.println(list);*/

//to update elemet value 
list.set(3,4);
System.out.println(list);


//to check any particular element is present in it contain is used , it return true or false 
System.out.println(list.contains(4));



    }
}