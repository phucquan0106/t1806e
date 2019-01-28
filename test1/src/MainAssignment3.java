import java.util.Scanner;

public class MainAssignment3 {

    public static void main(String[] args) {
        System.out.println("ASSIGNMENT3: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban khoi tao 1 con Dog: ");
        System.out.println("Moi ban nhap Id: ");
        int dogId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Moi ban nhap chung loai: ");
        String dogChungLoai=scanner.nextLine();
        System.out.println("Moi ban nhap mau long: ");
        String dogMauLong=scanner.nextLine();
        System.out.println("Moi ban nhap can nang: ");
        int dogCanNang = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Moi ban nhap tuoi: ");
        int dogTuoi = scanner.nextInt();
        scanner.nextLine();
        Dog dog1 = new Dog(dogId, dogChungLoai, dogMauLong, dogCanNang, dogTuoi);

        System.out.println("Moi ban khoi tao 1 con Cat: ");
        System.out.println("Moi ban nhap Id: ");
        int catId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Moi ban nhap chung loai: ");
        String catChungLoai=scanner.nextLine();
        System.out.println("Moi ban nhap mau long: ");
        String catMauLong=scanner.nextLine();
        System.out.println("Moi ban nhap can nang: ");
        int catCanNang = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Moi ban nhap tuoi: ");
        int catTuoi = scanner.nextInt();
        scanner.nextLine();
        Cat cat1 = new Cat(catId, catChungLoai, catMauLong, catCanNang, catTuoi);

        if(dog1.canNang > cat1.canNang){
            dog1.sua();
            cat1.chay();
        }else{
            cat1.cao();
            dog1.chay();
        }
    }
}
