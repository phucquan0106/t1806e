import java.util.ArrayList;

public class DonHang {
    int Id;
    int tongTien;
    ArrayList<SanPham> arrSanPham;

    public DonHang() {
    }

    public DonHang(int id, int tongTien, ArrayList<SanPham> arrSanPham) {
        Id = id;
        this.tongTien = tongTien;
        this.arrSanPham = arrSanPham;
    }

    public void themSanPham(SanPham sp){
        if(sp.getSoLuong() > 0){
            this.arrSanPham.add(sp);
            this.setTongTien(this.getTongTien()+sp.getGia()*sp.getSoLuong());
        }else{
            System.out.println("Het hang!");
        }
    }
    public void themSanPham(SanPham sp, int giamGia){
        if(sp.getSoLuong() > 0){
            sp.setGia(sp.getGia()*(100-giamGia)/100);
            this.arrSanPham.add(sp);
            this.setTongTien(this.getTongTien()+sp.getGia()*sp.getSoLuong());
        }else{
            System.out.println("Het hang!");
        }
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public ArrayList<SanPham> getArrSanPham() {
        return arrSanPham;
    }

    public void setArrSanPham(ArrayList<SanPham> arrSanPham) {
        this.arrSanPham = arrSanPham;
    }
}
