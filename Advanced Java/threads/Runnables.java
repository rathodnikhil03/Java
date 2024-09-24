package threads;

// class A implements Runnable {

//     public void run() {

//         int arr[] = new int[10];

//         for (@SuppressWarnings("unused") int i : arr) {
//             System.out.println("in show A" );
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {

//     public void run() {
//         int arr[] = new int[10];

//         for (@SuppressWarnings("unused")
//         int i : arr) {
//             System.out.println("in show B");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Runnables {

    public static void main(String[] args) {

       // A obj1 = new A();
       // B obj2 = new B();

        Runnable r1 = () ->
        {

            int arr[] = new int[10];
                
                for (@SuppressWarnings("unused") int i : arr) {
                    System.out.println("in show A" );
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } 
        };

        Runnable r2 =  () -> 
        {
           
             
                int arr[] = new int[10];
        
                for (@SuppressWarnings("unused") int i : arr) {
                    System.out.println("in show B");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }    
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
         
        t2.start();
        
        //Thread t1 = new Thread(obj1);
        //Thread t2 = new Thread(obj2);

        //t1.start();
         
        //t2.start();
       
         
    }
}
