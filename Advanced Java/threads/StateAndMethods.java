package threads;

public class StateAndMethods {

   // @SuppressWarnings("removal")
    public static void main(String[] args) throws InterruptedException {

        Runnable run = new Runnable() {
            // The run() method is the entry point for a thread. This method is called when
            // the thread is started,
            // and it contains the code that the thread will execute.
            public void run() {
                // Running (RUNNING): A thread is in the running state when it is currently
                // executing.
                System.out.println("run() method");
            }
        };

        // Newborn (NEW): A thread is in the newborn state when it is created but has
        // not yet started execution.
        Thread thread1 = new Thread(run);
        // The start() method starts the execution of a thread. This method is called
        // only once, and it schedules the thread for execution.
        thread1.start();
        // Runnable (RUNNABLE): A thread is in the runnable state when it is eligible to
        // run but has not yet started execution.

        // Timed Waiting (TIMED_WAITING):
        // A thread is in the timed waiting state when it is waiting for another thread
        // to perform a specific action with a specified time limit.
        Thread.sleep(10);

        Thread thread2 = new Thread(run);
        thread2.start();

        // The join() method waits for a thread to finish execution.
        // This method is useful when you need to ensure that a thread has completed its
        // execution before proceeding with other tasks.
        thread2.join();
        // Wait for the thread to finish
        

        // The getPriority() method returns the priority of a thread, and the
        // setPriority() method sets the priority of a thread.
        Thread thread3 = new Thread();
        System.out.println(thread3.getPriority()); // Get the thread priority
        thread3.setPriority(Thread.MIN_PRIORITY); // Set the thread priority
        thread3.start();
        //thread3.wait(100);
        //thread3.notify();

        


        // Waiting (WAITING): A thread is in the waiting state when it is waiting for
        // another thread to perform a specific action.
        Object lock = new Object();
        synchronized (lock) {
            lock.wait(); // Wait until notified
        }

        // In another thread
        synchronized (lock) {
            lock.notify(); // Notify the waiting thread
        }
        //The wait() method causes a thread to wait until it is notified, and the notify() method notifies a waiting thread.
    }

    //Running to Dead: When a thread completes execution, it transitions from the running state to the dead state.
    //thread3.stop();
     
}
