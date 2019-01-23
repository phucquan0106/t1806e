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
        SoNguyen soNguyen = new SoNguyen();
        System.out.println("Bai 1 Assignment2: ");
        soNguyen.nhapMotSo();
        soNguyen.bai1Assignment2(soNguyen.a);
        System.out.println("");
        System.out.println("Bai 2 Assignment2: ");
        System.out.println("Luu y : day so Fibonacci: 0,1,1,2,3,5,8,13,21,... bat dau tu 0.");
        soNguyen.nhapMotSo();
        System.out.println("Tong cua "+soNguyen.a+ " so dau tien cua day Fibonacci la: " +soNguyen.bai2Assignment2(soNguyen.a));
    }
}
