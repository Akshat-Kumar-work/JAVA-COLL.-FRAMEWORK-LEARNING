class temp extends Thread{

    public void run (){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }
}
class temp2 extends Thread{
    public void run (){
        for(int i=10;i<20;i++){
            System.out.println(i);
        }
    }
}
public class second {
    public static void main (String []args){
         temp object = new temp();
         object.start();
         temp2 object1 = new temp2();
         object1.start();
    }
}
