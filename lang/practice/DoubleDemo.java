package lang.practice;


public class DoubleDemo {
    public static void main(String[] args){

//        below the way of writing code is deprecated since Java 9
//        Double d1 = 3.14159;
//        Double d2 = new Double("314159E-5");

        Double d1 = 3.14;
        Double d2 = Double.valueOf("314E-2");


        System.out.println(d1 + " = "+ d2 + " -> "+ d1.equals(d2));
    }
}
