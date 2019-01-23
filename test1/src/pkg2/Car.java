package pkg2;

import java.util.Scanner;

public class Car {
    public int id;
    public int kilometer;
    public String color;
    public String brand;
    public int price;
    public Scanner scanner;

    public static int soBanh = 2;

    public Car(){
        System.out.println("Moi ban nhap Id: ");
        scanner = new Scanner(System.in);
        this.setId(scanner.nextInt());
        System.out.println("Moi ban nhap km: ");
        scanner = new Scanner(System.in);
        this.setKilometer(scanner.nextInt());
        System.out.println("Moi ban nhap price: ");
        scanner = new Scanner(System.in);
        this.setPrice(scanner.nextInt());
        System.out.println("Moi ban nhap color: ");
        scanner = new Scanner(System.in);
        this.setColor(scanner.nextLine());
        System.out.println("Moi ban nhap brand: ");
        scanner = new Scanner(System.in);
        this.setBrand(scanner.nextLine());

    }

    public Car(int id, int kilometer, String color, String brand, int price) {
        this.id = id;
        this.kilometer = kilometer;
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    void running(){
        System.out.println("Xe dang chay ... ");
    }
    public void reMake(Car x,String newColor){
        x.color=newColor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getSoBanh() {
        return soBanh;
    }

    public static void setSoBanh(int soBanh) {
        Car.soBanh = soBanh;
    }
}
