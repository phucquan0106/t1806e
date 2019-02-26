package Assignment9;

import java.util.Date;

public class VietCustomer extends Customer {

    private String category;

    public VietCustomer(int id, String name, Date dateBill, int numberKw, String category) {
        super(id, name, dateBill, numberKw);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public Float price() {
        Float result;
        if (this.getNumberKw() <= 50) {
            result = (float)this.getNumberKw() * Customer.PRICE_LOWER_50_TO_50;
        } else if (this.getNumberKw() > 50 && this.getNumberKw() <= 100) {
            result = (float)50 * Customer.PRICE_LOWER_50_TO_50 + (this.getNumberKw() - 50) * Customer.PRICE_FROM_51_TO_100;
        } else if (this.getNumberKw() > 100 && this.getNumberKw() <= 200) {
            result = (float)50 * Customer.PRICE_LOWER_50_TO_50 + 50 * Customer.PRICE_FROM_51_TO_100 + (this.getNumberKw() - 100) * Customer.PRICE_FROM_101_TO_200;
        } else {
            result = (float)50 * Customer.PRICE_LOWER_50_TO_50 + 50 * Customer.PRICE_FROM_51_TO_100 + 100 * Customer.PRICE_FROM_101_TO_200 + (this.getNumberKw() - 200) * Customer.PRICE_HIGHER_200;
        }
        return result;
    }

    @Override
    public void showExtend() {
        System.out.println("Customer type: " +  this.getCategory());
    }
}
