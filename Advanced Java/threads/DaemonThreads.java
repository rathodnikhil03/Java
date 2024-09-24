//Daemon Threads (also known as Background Threads) :-
//These threads are created and managed by the Java Virtual Machine (JVM) and are responsible for performing background tasks, such as garbage collection, finalization, and other system-level tasks. 
//They are also known as background threads because they run in the background, supporting the execution of the program.
package threads;
  
  // Create a new daemon thread
class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon Thread: Running...");
            try {
                Thread.sleep(5000); // sleep for 5 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class DaemonThreads {
    public static void main(String[] args) {
        // Create and start the daemon thread
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // set as daemon thread
        daemonThread.start();

        // Run the main thread for 10 seconds
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

