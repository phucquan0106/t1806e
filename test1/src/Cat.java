import java.util.Scanner;

public class Cat {

    int id;
    String chungLoai;
    String mauLong;
    int canNang;
    int tuoi;

    public Cat() {

    }

    public Cat(int id, String chungLoai, String mauLong, int canNang, int tuoi) {
        this.id = id;
        this.chungLoai = chungLoai;
        this.mauLong = mauLong;
        this.canNang = canNang;
        this.tuoi = tuoi;
    }

    void cao(){
        System.out.println("meo cao");
    }
    void an(){
        System.out.println("meo an");
    }
    void chay(){
        System.out.println("meo chay");
    }

}
