package ExamJava1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> arrItem = new ArrayList<Item>();
        Item item;
        String choice;
        int idExist;
        while (true) {
            System.out.println("MENU: ");
            System.out.println("1. Input item.");
            System.out.println("0. Exit.");
            System.out.println("Your choice: ");

            choice = scanner.nextLine().trim();
            switch (choice) {
                case ("1"):
                    System.out.println("Please input item details: ");
                    System.out.println("itemId: ");
                    int itemId = scanner.nextInt();
                    scanner.nextLine();
                    idExist = 0;
                    for (Item it : arrItem) {
                        if (it.getItemId() == itemId) {
                            System.out.println("itemID exist!");
                            idExist++;
                            break;
                        }
                    }
                    if(idExist == 0){
                        System.out.println("name: ");
                        String name = scanner.nextLine();
                        System.out.println("Producer: ");
                        String producer = scanner.nextLine();
                        System.out.println("price: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        item = new Item(itemId, name, producer, price);
                        arrItem.add(item);
                        for (Item item1 : arrItem) {
                            System.out.println("Item details: " + item1.toString());
                        }
                    }
                    break;
                case ("0"):
                    return;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }


        }


    }


}
