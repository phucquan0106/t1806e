package Lab1Thread;

public class CongratSubThread implements Runnable {

    @Override
    public void run() {
        for (int i=10;i>0;i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
        System.out.println("Happy new Year!");
    }
}
