public class SanPham {
    int Id;
    String ten;
    int gia;
    int soLuong;

    public SanPham() {
    }

    public SanPham(int id, String ten, int gia, int soLuong) {
        Id = id;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
    }
    public int kiemTraSoLuong(){
        return this.soLuong;
    }



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
