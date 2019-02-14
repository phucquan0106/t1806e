package Assignment5;

import java.util.ArrayList;

public class MainAssignment5 {
    public static void main(String[] args) {

        Ao ao1 = new Ao(1,"Ao Len",50,5,31,"Nau","Lacoste");
        Nhan nhan1 = new Nhan(1,"Nhan Kim cuong",100,5,10,"Dat");

        ArrayList<SanPham> arrSP = new ArrayList<SanPham>();
        Order order1 = new Order(1,0,arrSP);

        order1.mua(ao1,2);
        order1.mua(nhan1,3);

        System.out.println("Danh sach san pham cua don hang: ");
        System.out.println(ao1.getTen()+ " ;gia: "+ ao1.getGia()+ " USD; so luong: 2");
        System.out.println(nhan1.getTen()+ " ;gia: "+ nhan1.getGia()+ " USD; so luong: 3");
        System.out.println("Tong tien cua don hang: "+order1.getTongTien() + " USD");
        System.out.println("Danh sach san pham con lai: ");
        System.out.println(ao1.getTen()+ " con lai: " + ao1.getSoLuong());
        System.out.println(nhan1.getTen()+ " con lai: " + nhan1.getSoLuong());
    }
}
