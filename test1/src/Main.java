import pkg2.*;

import java.util.Scanner;

public class Main {
//    public int heSo = 10;
//    public final static int heSoMacDinh = 16;
//
//    public enum season {muaXuan, muaHe, muaThu, muaDong}
//
//    ;
//
//    public static int tinhGiaiThua(int x) {
//        int kq=1;
//        int i;
//        for(i=1;i<=x;i++){
//            kq=kq*i;
//        }
//        return kq;
//    }

    public static void main(String[] args) {
//        Main x = new Main();
//        System.out.println("heSo = " + x.heSo);
//        //Main.heSoMacDinh = 15;
//        System.out.println("heSoMacDinh = " + Main.heSoMacDinh);
//        System.out.println("Mua: " + season.muaDong);
//        //alo;
//        //bloe

//        System.out.println("Moi ban nhap 1 so de tinh giai thua: ");
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        System.out.println(x + " giai thua = "+ tinhGiaiThua(x));
       //Assignment2=============================================================
        SoNguyen soNguyen = new SoNguyen();
        System.out.println("Bai 1 Assignment2: ");
        soNguyen.nhapMotSo();
        soNguyen.bai1Assignment2(soNguyen.a);
        System.out.println("");
        System.out.println("Bai 2 Assignment2: ");
        System.out.println("Luu y : day so Fibonacci: 0,1,1,2,3,5,8,13,21,... bat dau tu 0.");
        soNguyen.nhapMotSo();
        System.out.println("Tong cua "+soNguyen.a+ " so dau tien cua day Fibonacci la: " +soNguyen.bai2Assignment2(soNguyen.a));
//        //Demo Customer ========================================================
//        Customer customer1 = new Customer();
//        customer1.customerId = 1;
//        customer1.customerName = "A";
//        customer1.age = 22;
//        customer1.address = "ad";
//
//        Customer customer2 = new Customer();
//        customer2.customerId = 2;
//        customer2.customerName = "B";
//        customer2.age = 23;
//        customer2.address = "adb";
//
//        if(customer1.age > customer2.age){
//            System.out.println(customer1.customerName +" nhieu tuoi hon "+ customer2.customerName);
//        }else{
//            System.out.println(customer2.customerName +" nhieu tuoi hon "+ customer1.customerName);
//        }
//        //Demo Car=========================================================
//        Car car1 = new Car();
//        car1.id = 1;
//        car1.color = "brown";
//        car1.kilometer = 28;
//        car1.brand = "BMW";
//
//        Car car2 = new Car();
//        car2.id = 2;
//        car2.color = "grey";
//        car2.kilometer = 25;
//        car2.brand = "Toyota";
//
//        if(car1.kilometer > car2.kilometer){
//            System.out.println("Xe 1 chay nhieu KM hon Xe 2");
//        }else if(car1.kilometer < car2.kilometer){
//            System.out.println("Xe 2 chay nhieu KM hon Xe 1");
//        }else{
//            System.out.println("2 xe co cung so KM");
//        }
        //Demo different Package=================================
//        Car car1 = new Car();
//        car1.id = 1;
//        car1.color = "brown";
//        car1.kilometer = 28;
//        car1.brand = "BMW";
//        System.out.println("so banh: "+Car.soBanh);
//        car1.reMake(car1,"red");
//        Car car2 = new Car(2);
        //Nhap Car va tim xe KH co budget mua duoc ===============================
//        Car[] arrCar = new Car[5];
//        for(int i=0;i<=4;i++){
//            System.out.println("Moi ban nhap thong tin o to thu " + (i+1));
//            arrCar[i]=new Car();
//        }
//        Scanner scc;
//        Customer customer = new Customer();
//        System.out.println("Moi ban nhap budget cua nguoi mua hang: ");
//        scc = new Scanner(System.in);
//        customer.budget=scc.nextInt();
//        System.out.println("Khach hang co the mua nhung xe co ID sau: ");
//        for(int i=0;i<=4;i++){
//            if(arrCar[i].price <= customer.budget){
//                System.out.print(arrCar[i].id + "   ");
//            }
//        }


        //Assignment3=============================================

        //        Customer objCustomer1 = new Customer();
//        objCustomer1.customerId = 1;
//        objCustomer1.customerName = "Nguyen van An";
//        objCustomer1.age = 18;
//        objCustomer1.address = "8 Ton that thuyet";

//        Customer objCustomer2 = new Customer();
//        objCustomer2.customerId = 2;
//        objCustomer2.customerName = "Le van Tam";
//        objCustomer2.age = 20;
//        objCustomer2.address = "8 Ton that thuyet";

//        if(objCustomer1.age > objCustomer2.age){
//            System.out.println(objCustomer1.customerName + " nhieu tuoi hon");
//        }else{
//            System.out.println(objCustomer2.customerName + " nhieu tuoi hon");
//        }

        Scanner scanner = new Scanner(System.in);
        Car[] car_arr = new Car[5];
        for (int i=0;i< 5;i++){
            System.out.println("nhap car ID: ");
            int carId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("nhap car Color: ");
            String carColor = scanner.nextLine();
            System.out.println("nhap car carKm: ");
            int carKm = scanner.nextInt();
            scanner.nextLine();
            System.out.println("nhap car Brand: ");
            String carBrand = scanner.nextLine();
            System.out.println("nhap car Price: ");
            int carPrice = scanner.nextInt();
            scanner.nextLine();
            car_arr[i] = new Car(carId,carKm,carColor,carBrand,carPrice);
        }

        int so_tien = scanner.nextInt();
        Customer objcus = new Customer(1,"Le van A",25,"8 ton that thuyet",so_tien);
        objcus.kiemTraKhaNang(car_arr);


//        Car car1 = new Car();
//        car1.carId = 1;
//        car1.color = "Red";
//        car1.carKm = 1000;
//        car1.brand = "BMW";
//        System.out.println("Mau xe: "+ car1.color);
//        //car1.running();
        //Car car2 = new Car(5,7500,"Yellow","Honda");
//        car2.carId = 2;
//        car2.color = "GREEN";
//        car2.carKm = 2000;
//        car2.brand = "Audi";
//
//        car1.reMake(car2,"Pink");
//        System.out.println("Mau xe: "+ car1.color);


    }
}
