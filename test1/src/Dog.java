import java.util.Scanner;

public class Dog {

    int id;
    String chungLoai;
    String mauLong;
    int canNang;
    int tuoi;

    public Dog() {

    }

    public Dog(int id, String chungLoai, String mauLong, int canNang, int tuoi) {
        this.id = id;
        this.chungLoai = chungLoai;
        this.mauLong = mauLong;
        this.canNang = canNang;
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
