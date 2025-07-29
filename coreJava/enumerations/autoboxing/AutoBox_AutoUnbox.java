package coreJava.enumerations.autoboxing;

public class AutoBox_AutoUnbox {
    public static void main(String[] args) {
        // Autobox

        Integer intObj = 100;
        Double doubleObj = 2.2;
        Float fObj = 1.1f;
        Byte byteObj = 33;

        // Unbox the object

        int i = intObj;
        double d = doubleObj;
        float f = fObj;
        byte b = byteObj;

        System.out.println(intObj+ " "+ i);
        System.out.println(doubleObj+ " "+ d);
        System.out.println(fObj+ " "+ f);
        System.out.println(byteObj+ " "+ b);

        System.out.println("\nChecking for equality using equals(): ");
        System.out.println(intObj.equals(i));
        System.out.println(doubleObj.equals(d));
        System.out.println(fObj.equals(f));
        System.out.println(byteObj.equals(b));
        System.out.println("\nChecking for equality using == ");
        System.out.println(doubleObj==d);
        System.out.println(intObj==i);
        System.out.println(fObj==f);
        System.out.println(byteObj==b);

        System.out.println();
        Integer iOb2 = AutoBox.x(99);
        System.out.println(iOb2);
        System.out.println("class name of iOb2: "+ iOb2.getClass());

    }
}

class AutoBox{
    static int x(Integer i){
        return i; // returns the int primitive type as output by taking Integer object as input
    }

}
