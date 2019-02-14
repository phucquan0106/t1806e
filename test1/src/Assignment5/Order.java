package Assignment5;

import java.util.ArrayList;

public class Order {
    private int id;
    private int tongTien;
    private ArrayList<SanPham> arrSanPham;

    public Order() {
    }

    public Order(int id, int tongTien, ArrayList<SanPham> arrSanPham) {
        this.id = id;
        this.tongTien = tongTien;
        this.arrSanPham = arrSanPham;
    }

    public void mua(SanPham sp,int soLuong){
        if((soLuong >0) && (sp.getSoLuong()>= soLuong)) {
            this.arrSanPham.add(sp);
            this.tongTien += sp.getGia()*soLuong;
            sp.setSoLuong(sp.getSoLuong()-soLuong);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
