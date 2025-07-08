import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class o62_lambda1 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.forEach( (n) -> {System.out.println(n); } );
    }
}
