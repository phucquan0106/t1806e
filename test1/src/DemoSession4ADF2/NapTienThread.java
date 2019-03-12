package DemoSession4ADF2;

public class NapTienThread extends Thread {
    public Account account = new Account();

    public NapTienThread(Account account){
        this.account = account;
    }

    public void run(){
        this.account.napTien(40000);
    }
}

