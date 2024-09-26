//Mutation with Threads in Java :-
//In Java, a mutation can be simulated using threads. 
//Here's an example of how you can create a program that demonstrates a mutation using threads:

//Synchronized :-
//In Java, synchronized is a keyword that is used to control access to shared resources in a multithreaded environment. 
//It is used to ensure that only one thread can execute a specific block of code at a time, 
//thereby preventing concurrent modifications to shared data.
package threads;

class Counter{

    int count;
    public synchronized void incerment(){

        count++;
    }
}


public class RaceCondition {
    
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();

        Runnable r1 = () -> {            //Using the Lambda Expressions 
            
            for(int i=1; i<=100000; i++){
                c.incerment();
            }
             
        };

        Runnable r2 =  () -> {
            
            for(int i=1; i<=100000; i++){
                c.incerment();
            }
            
        };

        //if we not using a Synchronized method it is actually getting the value of count, if you see we are saying count++ in increment() method
        //it's actually two steps first it'll get the value of count,the current value of count and then it'll say, count = count + 1.
        //because that how count++ works, so there are two steps, get the value for count and whatever a value you get, just add it with one
        //now suppose the value of count is zero the t1 thread increment the count 0 + 1 = 1 the new value is 10
        //than the t2 thread increment the count 1 + 1 = 2 it's gosse on upto 1000 if you complie and run the code first time 
        //than you the code second time the both t1 & t2 threads are reachingto count at the same time they both get the value is zero 
        //they both said  0 + 1 = 1 we increment two times,but the increment,it happens only once
        
        //THAT'S WHAT HAPPENS WHE YOU HAVE TWO THREADS WORKING WITH THE SAME VARIABLE OR SHARED VARIABLE, SO MUTATION AND THREAD ARE NOT GOOD.

        //NOW HOW DO MAKE SURE THAT ONLY ONE THREAD WORKS WITH THAT AT ONE TIME FOR EXAMPLE :- When t1 is woring with increment() 
        //t2 can't work with increment. In that case, you can use a very simple keyword called Synchronized.
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
