package coreJava.enumerations.autoboxing;

public class AutoBox2 {
    public static void main(String[] args) {

        Integer Ob1, Ob2;
        int i;

        Ob1 = 100;
        System.out.println("value of 100: "+ Ob1);
        ++Ob1;
        System.out.println("after ++Ob1: "+ Ob1);

        Ob2 = Ob1 + ( Ob1 / 3);
        System.out.println("Ob2 after expression: "+ Ob2);

        i = Ob1 + (Ob2/3);
        System.out.println("i after expression: "+ i);
    }
}
