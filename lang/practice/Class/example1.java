package lang.practice.Class;

class X {
    int a;
    float b;
}

class Y extends X{
    double c;
}

public class example1 {

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class callObj;

        callObj = x.getClass();
        System.out.println("x is object of type: "+callObj.getSimpleName());

        callObj = y.getClass();
        System.out.println("y is object of type: "+callObj.getSimpleName());

        callObj = callObj.getSuperclass();
        System.out.println("y's superclass is: "+ callObj.getSimpleName());
    }

}
