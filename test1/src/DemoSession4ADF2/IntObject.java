package DemoSession4ADF2;

public class IntObject {
    public  int s = 2;

    public synchronized void nextPrime(){
        for(int i = s+1;true;i++){
            if (checkPrime(i)){
                System.out.println(Thread.currentThread().getName()+" prime: "+ this.s);
                this.s = i;
                break;
            }
        }
    }
    public synchronized void print(){
        System.out.println(Thread.currentThread().getName()+" prime: "+ this.s);
    }


    public boolean checkPrime(int n){
        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
