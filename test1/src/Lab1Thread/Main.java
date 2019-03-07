package Lab1Thread;

public class Main {
    public static void main(String[] args) {
        SubThread1 subThread1 = new SubThread1();
        Thread thread = new Thread(subThread1);
        thread.start();

    }

}
