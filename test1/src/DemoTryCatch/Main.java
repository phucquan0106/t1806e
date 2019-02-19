package DemoTryCatch;

public class Main {
    public static void main(String[] args) throws Exception {
        int x = 0;
        int y = 0;
        try{
            if (x==0||y==0){
                throw new Exception("Zero error");
            }
            int z = x/y;
        }catch (ArithmeticException ex){
            System.out.println("Loi: "+ ex.getMessage());
        }catch (Exception e){
            System.out.println("Loi chung: "+ e.getMessage());
        }finally {
            System.out.println("Xay ra loi");
        }

        System.out.println("end game");

    }
}
