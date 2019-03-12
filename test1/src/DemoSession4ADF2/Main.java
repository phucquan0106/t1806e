package DemoSession4ADF2;

public class Main {
    public static void main(String args[]){
//        SubThread subThread1 = new SubThread();
//        subThread1.setName("Thread 1");
//        subThread1.start();
//        try{
//            subThread1.join();
//        }catch (InterruptedException e){}
//        SubThread subThread = new SubThread();
//        subThread.setName("Thread 2");
////        subThread.setDaemon(true);
//        subThread.start();

        //=================================
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        counterThread1.start();
        counterThread2.start();
        System.out.println("Main thread stop");
    }
}