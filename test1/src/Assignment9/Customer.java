package Assignment9;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Customer {
    private int id;
    private String name;
    private Date dateBill;
    private int numberKw;


    public static int PRICE_LOWER_50_TO_50 = 1000;
    public static int PRICE_FROM_51_TO_100  =1200;
    public static int PRICE_FROM_101_TO_200 = 1500;
    public static int PRICE_HIGHER_200 =  2000;
    public static int PRICE_FOREIGN =  2000;

    public Customer(int id, String name, Date dateBill, int numberKw) {
        this.id = id;
        this.name = name;
        this.dateBill = dateBill;
        this.numberKw = numberKw;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateBill() {
        return dateBill;
    }

    public void setDateBill(Date dateBill) {
        this.dateBill = dateBill;
    }

    public int getNumberKw() {
        return numberKw;
    }

    public void setNumberKw(int numberKw) {
        this.numberKw = numberKw;
    }



    public abstract Float price();

    public void show(){
        System.out.println("id: " + this.getId());
        System.out.println("name: " + this.getName());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date Bill:: " + simpleDateFormat.format(this.getDateBill()));
        System.out.println("numberOfKW: " + this.getNumberKw());
        showExtend();
    };

    public abstract void showExtend();


}
