package Assignment9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        ArrayList<Customer> arrCustomer = new ArrayList<Customer>();
        int id = 0;
        while (true){
            System.out.println("MANAGE CUSTOMER");
            System.out.println("1. Input Bill");
            System.out.println("2. Show Bill");
            System.out.println("3. Total customer of each type");
            System.out.println("4. Average Foreign customer payment");
            System.out.println("5. Show Bill of Jan 2019");
            System.out.println("0. Exit");

            int choice = input("your choice");
            switch (choice) {
                case 1://===============Input Bill =====================
                    id++;
                    String name = inputString("name");
                    Date date = inputDate("date of order (dd/MM/yyyy)");
                    int numberOfKW = input("number of kw");
                    int type = input("Nationality: (input 1 if Vietnamese)");
                    Customer customer;
                    if (type == 1) {
                        String category = inputString("Customer Category");
                        customer = new VietCustomer(id,name,date,numberOfKW,category);
                    } else {
                        String nationality = inputString("nationality");
                        customer = new ForeignCustomer(id, name, date, numberOfKW,nationality);
                    }
                    arrCustomer.add(customer);
                    break;
                case 2://============Show Bill===============================
                    for (Customer cc : arrCustomer) {
                        cc.show();
                    }
                    break;
                case 3:
                    int count = 0;
                    for (Customer cc : arrCustomer) {
                        if (cc instanceof VietCustomer) count++;
                    }
                    System.out.println("Number of Vietnamese customers: " + count);
                    System.out.println("Number of foreigners: " + (arrCustomer.size() - count));
                    break;
                case 4:
                    int sum = 0, num = 0;
                    for (Customer cc : arrCustomer) {
                        if (cc instanceof ForeignCustomer) {
                            sum += cc.price();
                            num++;
                        }
                    }
                    if (num > 0) {
                        System.out.println("Average Foreigners payment: " + sum / num);
                    } else {
                        System.out.println("There's no Foreigner.");
                    }
                    break;
                case 5:
                    System.out.println("Bill of Jan 2019: ");
                    //Calendar calendar = Calendar.getInstance();
                    for (Customer cc : arrCustomer) {
                        //calendar.setTime(cc.getDateBill());
                        //if (calendar.get(Calendar.MONTH) == 1 && calendar.get(Calendar.YEAR) == 2019){
                        if (cc.getDateBill().getMonth() == 0 && cc.getDateBill().getYear() == 119){
                            cc.show();
                        }
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }

        }
    }
    public static int input(String field) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + field + ":");
        while (!scanner.hasNextInt()) {
            System.out.println("wrong input!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String inputString(String field) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + field + ":");
        return scanner.nextLine();
    }

    public static Date inputDate(String field) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + field + ":");
        String date = scanner.nextLine();
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("wrong date format");
            return inputDate(field);
        }
    }
}
