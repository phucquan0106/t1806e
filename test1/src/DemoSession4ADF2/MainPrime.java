package DemoSession4ADF2;

public class MainPrime {
    public static void main(String[] args) {
        IntObject intObject = new IntObject();
        PrimeThread primeThread1 = new PrimeThread(intObject);
        PrimeThread primeThread2 = new PrimeThread(intObject);
        primeThread1.start();
        primeThread2.start();
    }
}
