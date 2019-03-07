package Lab1Thread;

import java.util.ArrayList;

public class SubThread extends Thread{
    public void run(){
        System.out.println("Current Thread: "+ Thread.currentThread().getName());
        Thread.currentThread().setName("MyJavaThread");
        System.out.println("Current Thread: "+ Thread.currentThread().getName());
//        ArrayList<Integer> arrNum = arrNPrime(10);
       int number =0;
        for(int i =2;number<10;i++){
           if(checkPrime(i)){
               System.out.println("Prime: "+ i);
               number++;
               try{
                   Thread.sleep(1500);
               }catch (InterruptedException e){}
           }
       }

    }
//    public ArrayList<Integer> arrNPrime(int n){
//        ArrayList<Integer> arrPrime = new ArrayList<>();
//        int i = 2;
//        int dem = 0;
//        if(n<1){
//            return null;
//        }
//        while (dem <= n){
//            if (checkPrime(i)){
//                dem++;
//                arrPrime.add(i);
//                i++;
//            }
//        }
//        return arrPrime;
//    }
    public static boolean checkPrime(int n){
        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
