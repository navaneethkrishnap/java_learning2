package lang.practice;

public class isNaN {
    public static void main(String[] args){
        Double d1 = 0/0.;

        System.out.println(d1 + " is NaN : "+ d1.isNaN());
        System.out.println(d1+ " is Infinite "+d1.isInfinite());
    }
}
