package DemoTryCatch;
import java.time.*;

interface Sum{
    int tinhTong(int a,int b);
}

public class DemoDateTime {


    public static void main(String[] args) {
        SayHello sayHello = new SayHello() {
            @Override
            public void sayHello() {
                System.out.println("say hello!");
            }
        };
        sayHello.sayHello();
        SayHello sayHello1 = () -> {
            System.out.println("Lambda..");
        };
        sayHello1.sayHello();

        Sum sum = (int a, int b) -> {
            return a+b;
        };
        System.out.println("Test Sum: "+sum.tinhTong(4,5));

//        LocalDate localDate =  LocalDate.now();
//        System.out.println("Day of year: "+ localDate.getDayOfYear() );
//        System.out.println("Today: "+localDate);
//        System.out.println("Next day: "+localDate.plusDays(1));
//        LocalDate localDate1 = LocalDate.of(2018,2,28);
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime.plusHours(1));

    }
}
