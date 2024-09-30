//User Threads (also known as Foreground Threads) :- 
//These threads are created and managed by the user (developer) and are responsible for executing a specific task. 
//They are also known as foreground threads because they are in the foreground, meaning they are actively running and performing tasks.

package threads;
import java.util.Scanner;

class Pitaji extends Thread{

    public void run(){

        
        System.out.print("my Pitaji was showing a result to me : ");
        try (Scanner scanner = new Scanner(System.in)) {
            int result = scanner.nextInt();
            int arr[] = new int[result];
            for(int i : arr){
                System.out.println("result : " + i);

                try{
                Thread.sleep(10);
                }catch(Exception e){
                    System.out.println("Something is worng " + e);
                } 
            }
        }
    }
    
}
class Mataashree extends Thread{

    public void run(){

        System.out.print("my mataashree was showing a result to me :");
        try (Scanner scanner = new Scanner(System.in)) {
            int result = scanner.nextInt();
            int arr[] = new int[result];

            for(int j : arr){
                  System.out.println("result : " + j);
                  try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Something is worng " + e);
                }
            }
        }
    }
}
public class UserThreads {
    
    public static void main(String[] args) {
        
        Pitaji obj1 = new Pitaji();
        Mataashree obj2 = new Mataashree();

        //obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
    }
}

// bkl usko start to hone