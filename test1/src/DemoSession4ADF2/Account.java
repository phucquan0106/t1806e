package DemoSession4ADF2;

public class Account {
    public int money = 10000;

    public synchronized void rutTien(int amount){
//        if(this.money > amount){
//            System.out.println("Rut thanh cong: "+amount);
//            this.money-= amount;
//        }else {
//            System.out.println("Tai khoan khong du tien.");
//        }
        if(this.money <amount){
            System.out.println(Thread.currentThread().getName()+ " Khong du tien rut");
            try {
                wait();
            }catch (Exception e){}
        }
        this.money -= amount;
        System.out.println("Rut thanh cong: "+amount);
    }

    public synchronized void napTien(int amount){
//        this.money += amount;
//        System.out.println("Nap thanh cong so tien: "+amount);
//        try{
//            notifyAll();
//        }catch (Exception e){}
        for(int i=0;i<5;i++){
            this.money += amount;
            System.out.println("Nap thanh cong so tien: "+ amount+" Balance: "+ this.money);
            try {
                notify();
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
