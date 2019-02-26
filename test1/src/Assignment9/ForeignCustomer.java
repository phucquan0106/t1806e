package Assignment9;

import java.util.Date;

public class ForeignCustomer extends Customer {

    private String nationality;

    public ForeignCustomer(int id, String name, Date dateBill, int numberKw, String nationality) {
        super(id, name, dateBill, numberKw);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public Float price() {
        return (float)this.getNumberKw()*Customer.PRICE_FOREIGN;
    }

    @Override
    public void showExtend() {
        System.out.println("nationality: " + this.getNationality());
    }
}
