package coreJava.enumerations;

public class EnumDemo4 {

    public static void main(String[] args) {

        {
            Apple op,op2,op3;

            // odrinal values - ordinal() return the position of enum constants

            System.out.print("Ordinal values using ordinal(): ");

            for(Apple i : Apple.values()){
                System.out.print(i.ordinal()+" ");
            }
            System.out.println();

            op = Apple.J;
            op2 = Apple.S;
            op3 = Apple.N;

            // compareTo()
            if(op.compareTo(op2) < 0 ) System.out.println(op + " comes before "+ op2);
            if(op2.compareTo(op3) < 0) System.out.println(op2 + " comes before "+ op3);
            if(op.compareTo(op3) < 0) System.out.println(op + " comes before "+ op3);

            // equals()
            System.out.println();
            if(op.equals(op2)) System.out.println("Error!");
            if(op.equals(op3)) System.out.println(op + " equals "+ op3);
            if(op == op3) System.out.println(op + " == "+ op3);

        }
    }
}
