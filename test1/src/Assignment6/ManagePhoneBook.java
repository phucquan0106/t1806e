package Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagePhoneBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s,name,phone,exit;
        ArrayList<Contact> arrContact = new ArrayList<Contact>();
        PhoneBook phoneBook = new PhoneBook(arrContact);
        while (true){
            System.out.println("PHONEBOOK MANAGEMENT SYSTEM:" + "\n"
                                + "1. Insert Phone" + "\n"
                                + "2. Remove Phone" + "\n"
                                + "3. Update Phone" + "\n"
                                + "4. Search Phone" + "\n"
                                + "5. Sort\n"
                                + "0. Exit" + "\n"
                                + "Your choice: "
            );
            s= scanner.nextLine().trim();
            switch (s){
                case ("1")://================Insert Phone==============
                    System.out.println("Please input Name and Phone to Insert: ");
                    System.out.println("Name: ");
                    name = scanner.nextLine();
                    System.out.println("Phone: ");
                    phone = scanner.nextLine();
                    phoneBook.insertPhone(name,phone);

                    System.out.println("Enter number 1 to go back Menu or any other to EXIT");
                    exit = scanner.nextLine();
                    if(exit.equals("1")){
                        continue;
                    }else{
                        return;
                    }
                case ("2")://================Remove Phone==============
                    System.out.println("Please input Name to Remove: ");
                    name = scanner.nextLine();
                    phoneBook.removePhone(name);

                    System.out.println("Enter number 1 to go back Menu or any other to EXIT");
                    exit = scanner.nextLine();
                    if(exit.equals("1")){
                        continue;
                    }else{
                        return;
                    }
                case ("3")://================Update Phone==============
                    System.out.println("Please input Name to Update: ");
                    System.out.println("Name: ");
                    name = scanner.nextLine();
                    System.out.println("New Phone: ");
                    phone = scanner.nextLine();
                    phoneBook.updatePhone(name,phone);

                    System.out.println("Enter number 1 to go back Menu or any other to EXIT");
                    exit = scanner.nextLine();
                    if(exit.equals("1")){
                        continue;
                    }else{
                        return;
                    }
                case ("4")://================Search Phone==============
                    System.out.println("Please input Name to Search: ");
                    System.out.println("Name: ");
                    name = scanner.nextLine();
                    phoneBook.searchPhone(name);

                    System.out.println("Enter number 1 to go back Menu or any other to EXIT");
                    exit = scanner.nextLine();
                    if(exit.equals("1")){
                        continue;
                    }else{
                        return;
                    }
                case ("5")://================Sort==============
                    phoneBook.sort();

                    System.out.println("Enter number 1 to go back Menu or any other to EXIT");
                    exit = scanner.nextLine();
                    if(exit.equals("1")){
                        continue;
                    }else{
                        return;
                    }
                case ("0")://================EXIT==============
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
}
