public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello from My Thread!" + Thread.currentThread().threadId());
    }

}
