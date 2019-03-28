package PractiseADF2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservation reservation = new Reservation();
        String choice;
        String exit;
        String reservationId;
        String name;
        String address;
        String phone;
        Date departureDate;
        Date returnDate;
        Passenger passenger;
        Iterator<Passenger> iterator;

        while (true){
            System.out.println("=========MENU========");
            System.out.println("1. Add reservation.");
            System.out.println("2. Modify passenger records.");
            System.out.println("3. Display passenger records.");
            System.out.println("4. Exit");
            System.out.println("Your choice: ");
            choice= scanner.nextLine().trim();
            switch (choice){
                case ("1")://================Add reservation==============
                    System.out.println("Please input reservation details: ");
                    reservationId = inputString("reservationId");
                    name = inputString("name");
                    address = inputString("address");
                    phone = inputString("phone");
                    departureDate = inputDate("departure date (dd/mm/yyyy)");
                    returnDate = inputDate("return date (dd/mm/yyyy)");
                    passenger = new Passenger(reservationId, name, address, phone, departureDate, returnDate);
                    reservation.add(passenger);

                    System.out.println("Enter number 1 to go back Menu or any other to EXIT");
                    exit = scanner.nextLine().trim();
                    if(exit.equals("1")){
                        continue;
                    }else{
                        return;
                    }
                case ("2")://================Modify passenger records==============
                    System.out.println("Update information: ");
                    reservationId = inputString("reservationId");
                    name = inputString("name");
                    address = inputString("address");
                    phone = inputString("phone");
                    departureDate = inputDate("departure date (dd/mm/yyyy)");
                    returnDate = inputDate("return date (dd/mm/yyyy)");
                    passenger = new Passenger(reservationId, name, address, phone, departureDate, returnDate);
                    iterator = reservation.iterator();
                    while (iterator.hasNext()) {
                        Passenger passengerInQueue = iterator.next();
                        if (passengerInQueue != null && reservationId.equals(passengerInQueue.getReservationId())) {
                            reservation.remove(passengerInQueue);
                            reservation.add(passenger);
                        }
                    }

                    System.out.println("Enter number 1 to go back Menu or any other to EXIT");
                    exit = scanner.nextLine().trim();
                    if(exit.equals("1")){
                        continue;
                    }else{
                        return;
                    }
                case ("3")://================Display passenger records==============
                    System.out.println("Display passenger records: ");

                    iterator = reservation.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().show();
                    }

                    System.out.println("Enter number 1 to go back Menu or any other to EXIT");
                    exit = scanner.nextLine().trim();
                    if(exit.equals("1")){
                        continue;
                    }else{
                        return;
                    }
                case ("4")://================Search Phone==============
                     return;
                default://=============Wrong Choice==============
                    System.out.println("Wrong Choice!");
                    System.out.println("Enter number 1 to go back Menu or any other to EXIT");
                    exit = scanner.nextLine().trim();
                    if(exit.equals("1")){
                        continue;
                    }else{
                        return;
                    }

            }

        }

    }
    public static int input(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input: " + str);
        int input = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String inputString(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input " + str);
        return scanner.nextLine();
    }

    public static Date inputDate(String field) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input " + field + ":");
        String date = scanner.nextLine();
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("Wrong input");
            return inputDate(field);
        }
    }
}
