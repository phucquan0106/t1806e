import java.util.Scanner;

public class MainAssignment3 {

    public static void main(String[] args) {
        System.out.println("Moi ban khoi tao 1 con Dog: ");
        Dog dog1 = new Dog();
        System.out.println("Moi ban khoi tao 1 con Cat: ");
        Cat cat1 = new Cat();
        if(dog1.canNang > cat1.canNang){
            dog1.sua();
            cat1.chay();
        }else{
            cat1.cao();
            dog1.chay();
        }
    }
}
