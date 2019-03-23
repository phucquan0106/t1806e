package ADF2Session_9;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        //US
        ResourceBundle resourceBundle_us = ResourceBundle.getBundle("ADF2Session_9.Message", Locale.US);
        System.out.println(resourceBundle_us.getString("message_hello"));
        //VN
        Locale locale = new Locale("vi","VN");
        ResourceBundle resourceBundle_vi = ResourceBundle.getBundle("ADF2Session_9.Message",locale);
        System.out.println(resourceBundle_vi.getString("message_hello"));
        //Default app
        Locale.setDefault(new Locale("vi","VN"));

        ResourceBundle rB = ResourceBundle.getBundle("ADF2Session_9.Message");
        System.out.println(rB.getString("message_hello"));

        double number = 3.14152;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        String number2 = numberFormat.format(number);
        System.out.println(number2+11);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String currency = currencyFormat.format(number);
        System.out.println(currency);

    }
}
