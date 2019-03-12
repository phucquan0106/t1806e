package DemoSession4ADF2;

public class RutTienThread extends Thread {
    public Account account = new Account();

    public RutTienThread(Account account){
        this.account = account;
    }

    public void run(){
        this.account.rutTien(20000);
    }
}
