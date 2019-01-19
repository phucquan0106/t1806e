public class Main {
    public int heSo = 10;
    public final static int heSoMacDinh = 16;
    public enum season{muaXuan,muaHe,muaThu,muaDong};
    public static void main(String[] args) {
        Main x = new Main();
        System.out.println("heSo = "+ x.heSo);
        //Main.heSoMacDinh = 15;
        System.out.println("heSoMacDinh = "+Main.heSoMacDinh);
        System.out.println("Mua: "+season.muaDong);
    }
}
