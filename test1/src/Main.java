import java.util.Scanner;

public class Main {
    public int heSo = 10;
    public final static int heSoMacDinh = 16;

    public enum season {muaXuan, muaHe, muaThu, muaDong}

    ;

    public static int tinhGiaiThua(int x) {
        int kq=1;
        int i;
        for(i=1;i<=x;i++){
            kq=kq*i;
        }
        return kq;
    }

    public static void main(String[] args) {
//        Main x = new Main();
//        System.out.println("heSo = " + x.heSo);
//        //Main.heSoMacDinh = 15;
//        System.out.println("heSoMacDinh = " + Main.heSoMacDinh);
//        System.out.println("Mua: " + season.muaDong);
//        //alo;
//        //bloe
        System.out.println("Moi ban nhap 1 so de tinh giai thua: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x + " giai thua = "+ tinhGiaiThua(x));
    }
}
