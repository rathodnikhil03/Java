package threads;
class Counter{

    int count;
    public void incerment(){

        count++;
    }
}


public class RaceCondition {
    
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();

        Runnable r1 = () -> {
            
            for(int i=1; i<=100000; i++){
                c.incerment();
            }
             
        };

        Runnable r2 =  () -> {
            
            for(int i=1; i<=100000; i++){
                c.incerment();
            }
            
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
