import java.util.Scanner;

import static java.lang.Math.*;

public class SoNguyen {
    Scanner scanner = new Scanner(System.in);
    public int a;

    public void nhapMotSo() {
        System.out.println("Moi ban nhap mot so nguyen: ");
        this.a = scanner.nextInt();
    }

    public boolean kiemTraNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int canBacHai = (int) sqrt(n);
        for (int i = 2; i <= canBacHai; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void bai1Assignment2(int n) {
        System.out.println("Danh sach cac so Nguyen to nho hon " + n + " la: ");
        for (int i = 0; i < n; i++) {
            if (this.kiemTraNguyenTo(i)) {
                System.out.print(i + "   ");
            }
        }
    }

    public int bai2Assignment2(int n) {
        int f1 = 0;
        int f2 = 1;
        int fn, sum=0;
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n >= 3) {
            sum = 1;
            for (int i = 3; i <= n; i++) {
                fn = f1 + f2;
                f1 = f2;
                f2 = fn;
                sum += fn;
            }

        }
        return sum;
    }
//    public int a, b;
//
//    public void nhap() {
//        System.out.println("a:");
//        this.a = scanner.nextInt();
//        System.out.println("b:");
//        this.b = scanner.nextInt();
//    }
//
//    public int congHaiSo() {
//        System.out.print("nhap so 1: ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.print("nhap so 2: ");
//        Scanner scanner2 = new Scanner(System.in);
//        int b = scanner2.nextInt();
//        return a + b;
//    }
//
//  /*  public int tinhGiaiThua(){
//        System.out.print("nhap: ");
//        Scanner scanner = new Scanner(System.in);
//        int n=scanner.nextInt();
//       int gt=1;
//       for(int i=1;i<=n;i++){
//           gt*=i;
//       }
//       return gt;
//   }*/
//
//    public int nhanHaiSo() {
//        System.out.print("nhap so 1: ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.print("nhap so 2: ");
//        Scanner scanner2 = new Scanner(System.in);
//        int b = scanner2.nextInt();
//        return a * b;
//    }
//
//    public int chiaHaiSo() {
//        System.out.print("nhap so 1: ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = 0;
//        do {
//            System.out.print("nhap so 2: ");
//            Scanner scanner2 = new Scanner(System.in);
//            b = scanner2.nextInt();
//        } while (b == 0);
//
//
//        return a / b;
//    }
//
//    public int truHaiSo() {
//        System.out.print("nhap so 1: ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.print("nhap so 2: ");
//        Scanner scanner2 = new Scanner(System.in);
//        int b = scanner2.nextInt();
//        return a - b;
//    }
}
