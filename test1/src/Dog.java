import java.util.Scanner;

public class Dog {
    Scanner scanner;
    int id;
    String chungLoai;
    String mauLong;
    int canNang;
    int tuoi;

    public Dog() {
        System.out.println("Moi ban nhap Id: ");
        scanner = new Scanner(System.in);
        this.setId(scanner.nextInt());
        System.out.println("Moi ban nhap chung loai: ");
        scanner = new Scanner(System.in);
        this.setChungLoai(scanner.nextLine());
        System.out.println("Moi ban nhap mau long: ");
        scanner = new Scanner(System.in);
        this.setMauLong(scanner.nextLine());
        System.out.println("Moi ban nhap can nang: ");
        scanner = new Scanner(System.in);
        this.setCanNang(scanner.nextInt());
        System.out.println("Moi ban nhap tuoi: ");
        scanner = new Scanner(System.in);
        this.setTuoi(scanner.nextInt());
    }

    public Dog(int id, String chungLoai, String mauLong, int canNang, int tuoi) {
        this.id = id;
        this.chungLoai = chungLoai;
        this.mauLong = mauLong;
        this.canNang = canNang;
        this.tuoi = tuoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChungLoai() {
        return chungLoai;
    }

    public void setChungLoai(String chungLoai) {
        this.chungLoai = chungLoai;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    void sua(){
        System.out.println("cho sua");
    }
    void an(){
        System.out.println("cho an");
    }
    void chay(){
        System.out.println("cho chay");
    }
}
