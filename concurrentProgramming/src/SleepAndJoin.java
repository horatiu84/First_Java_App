public class SleepAndJoin {
    public static void main(String[] args) {
        Thread t = new Thread( () -> {
            try {
                System.out.println("Thread will go to sleep for 2 seconds");
                Thread.sleep(2000); //pausing for 2 sec
                System.out.println(" Yawn ...* I'm awake!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } );
        t.start();

        Thread t1 = new Thread(() -> {
            System.out.println("t1 started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();

        try {
            System.out.println("Main thread will be waiting for t1 to be done ...");
            t1.join(); // Main thread waits for t1 to complete
            System.out.println("Main thread continue ...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
