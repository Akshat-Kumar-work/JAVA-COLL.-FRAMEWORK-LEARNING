class mythread implements Runnable{

    public void run(){

        System.out.println("akshat");
        
        System.out.println("yoyo");
    }
}
public class first {
    public static void main (String []args){
        //creating thread by runnable interface 
        
        mythread object = new mythread(); //mythread class object 
        
        Thread object2 = new Thread(object); //thread class object
        
        object2.start();





    }
}