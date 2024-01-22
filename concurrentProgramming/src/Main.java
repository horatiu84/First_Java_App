public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread: " + Thread.currentThread().threadId());
        MyThread myThread = new MyThread();
        myThread.run(); // This line kicks of the new thread

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        Runnable myRunable2 = ()-> System.out.println("Hello from a lambda Runnable!");
        Thread thread2 = new Thread(myRunnable);
        thread.start();
    }
}