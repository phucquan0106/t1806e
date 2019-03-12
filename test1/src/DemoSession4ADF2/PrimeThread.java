package DemoSession4ADF2;

public class PrimeThread extends Thread {
    public IntObject intObject = new IntObject();

    public PrimeThread(IntObject intObject){
        this.intObject = intObject;
    }

    public synchronized void run(){
        for(int i = 0;i<10;i++){
//            synchronized (this.counter){
            this.intObject.nextPrime();
//            this.intObject.print();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ex){}
//            }
        }
    }


    }

