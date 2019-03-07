package Lab1Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        //Part 1: Lab 1
//        SubThread1 subThread1 = new SubThread1();
//        Thread thread = new Thread(subThread1);
//        thread.start();
        //Part 2: Lab 1
        CongratSubThread congratSubThread = new CongratSubThread();
        Thread thread1 = new Thread(congratSubThread);
        thread1.start();

    }

}
