package Assignment5;

public class Jewelry extends SanPham{
    private int trongLuong;
    private String loai;

    public Jewelry() {
    }

    public Jewelry(int id, String ten, int gia, int soLuong, int trongLuong, String loai) {
        super(id, ten, gia, soLuong);
        this.trongLuong = trongLuong;
        this.loai = loai;
    }

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
}
