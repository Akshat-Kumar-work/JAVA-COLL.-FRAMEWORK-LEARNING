import java.util.Stack;
public class STACK {
    public static void main (String [] args){

        //creating stack
        Stack<String> animals = new Stack<>();


        //to add elements push function is used 
        animals.push("lions");
        animals.push("tigers");
        animals.push("elephants");
        animals.push("leopard");
        System.out.println(animals);

    //to check which is last element or which is on top of stack peek is used
    System.out.println(animals.peek());

    //to remove last element or top element in stack pop is used
    animals.pop();
    System.out.println(animals);


    }
    
}
