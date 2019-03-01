package ExamJava1;
import java.util.Scanner;


    public class Main1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Item item;
            System.out.println("Please input item details: ");
            System.out.println("itemId: ");
            int itemId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("name: ");
            String name = scanner.nextLine();
            System.out.println("Producer: ");
            String producer = scanner.nextLine();
            System.out.println("price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            item = new Item(itemId,name,producer,price);
            System.out.println("Item details: "+ item.toString());
        }


    }

