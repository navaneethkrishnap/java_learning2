package lang.practice;

public class isInfinite {
    public static void main(String[] args){
        Double d1 = 1/0.;

        System.out.println(d1 + " is infinite : "+d1.isInfinite());
        System.out.println(d1 + " is NaN : "+d1.isNaN());
    }
}
