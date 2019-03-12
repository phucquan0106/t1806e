package DemoSession4ADF2;

public class CounterThread extends Thread {
    public Counter counter = new Counter();

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run(){
        for(int i = 0;i<10;i++){
//            synchronized (this.counter){
                this.counter.change();
                this.counter.print();
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ex){}
//            }
        }
    }
}
