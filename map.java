import java.util.HashMap;
import java.util.Map;
public class map {

    public static void main (String [] args){

        Map <String, Integer> numbers = new HashMap<>(); 

        //to add use pull , keys are always unique
        numbers.put("one", 22);
        numbers.put("two", 23);
        numbers.put("three", 24);
        numbers.put("four", 25);
        numbers.put("five", 26);
        numbers.put("six", 27);

        System.out.println(numbers);

        //to travel or iterate every single key and value
        for(Map.Entry<String,Integer>e: numbers.entrySet()){
            System.out.println(e);
            //System.out.println(e.getKey()); //to get key 
            //System.out.println(e.getValue()); // to get values
        }
            //to iterate or travel every single   key 
            for(String key : numbers.keySet()){
                System.out.println(key);
            }

            //to iterate or travel every single values 
            for (Integer value : numbers.values()){
                System.out.println(value);

            }
        }
    }
    
    

