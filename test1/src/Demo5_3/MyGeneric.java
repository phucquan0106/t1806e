package Demo5_3;

public class MyGeneric <X,Y> {
    public X xValue;
    public Y yValue;

    public X getxValue() {
        return xValue;
    }

    public void setxValue(X xv) {
        xValue = xv;
    }

    public <E> void genericMethod(E e){
        System.out.println(e);
    }

    public <E> void genericMethod2(E e[]){
        for (int i=0;i<e.length;i++){
            System.out.println(e[i]);
        }
    }

    public <E> void multi(X x, Y y){

    }
}
