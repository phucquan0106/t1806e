package Assignment5;

public class Fashion extends SanPham {

    private int kichThuoc;
    private String mauSac;
    private String thuongHieu;

    public Fashion() {
    }

    public Fashion(int id, String ten, int gia, int soLuong, int kichThuoc, String mauSac, String thuongHieu) {
        super(id, ten, gia, soLuong);
        this.kichThuoc = kichThuoc;
        this.mauSac = mauSac;
        this.thuongHieu = thuongHieu;
    }

    public void giat(){

    }
    public void lamKho(){

    }
}
