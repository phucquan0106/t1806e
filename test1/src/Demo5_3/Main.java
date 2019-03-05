package Demo5_3;

public class Main {
    public static void main(String[] args) {
        MyGeneric<Integer,Integer> myGeneric1 = new MyGeneric<>();
        MyGeneric<String,String> myGeneric2 = new MyGeneric<>();
        MyGeneric<Integer,String> myGeneric3 = new MyGeneric<>();
        MyGeneric<String,Integer> myGeneric4 = new MyGeneric<>();

        YourGeneric<Integer,Integer,Integer> yourGeneric1 = new YourGeneric<>();
        YourGeneric<String,Integer,Integer> yourGeneric2 = new YourGeneric<>();
        YourGeneric<Integer,String,Integer> yourGeneric3 = new YourGeneric<>();

        myGeneric1.xValue = 1;
        yourGeneric2.x = "abb";
        yourGeneric2.y = 1;
        yourGeneric2.z = 3;

        myGeneric1.genericMethod("abc");
        myGeneric1.genericMethod(1);

    }
}
