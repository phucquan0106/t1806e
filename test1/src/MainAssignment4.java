import java.util.ArrayList;

public class MainAssignment4 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham(1,"sp1",100,5);
        SanPham sp2 = new SanPham(2,"sp2",200,2);
        SanPham sp3 = new SanPham(3,"sp3",300,0);

        ArrayList<SanPham> arrSp = new ArrayList<SanPham>();
        DonHang dh1 = new DonHang(1,0, arrSp);
        dh1.themSanPham(sp1);
        dh1.themSanPham(sp2,20);
        dh1.themSanPham(sp3);

        for (int i=0; i<dh1.arrSanPham.size();i++){
            System.out.println("San pham: "+ dh1.arrSanPham.get(i).getTen()
                    + "; So luong: " +dh1.arrSanPham.get(i).getSoLuong()
                    + "; Gia tien: " +dh1.arrSanPham.get(i).getGia()

            );
        }
        System.out.println("Tong tien cua don hang: " + dh1.getTongTien());

    }
}
