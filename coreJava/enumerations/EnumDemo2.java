package coreJava.enumerations;

// values() and valuesOf()

public class EnumDemo2 {
    public static void main(String[] args) {
        {
            Apple op;
            System.out.println("Here all are Apple constants");

            // values() == return an array of enumerations constants
            Apple allValues[] = Apple.values();
            for(Apple a: allValues){
                System.out.println(a);
            }

            System.out.println();

            // valuesOf() == returns the value of particular enum constant defined, by taking the constant name as string input
            op = Apple.valueOf("N");
            System.out.println("op contains "+ op);

        }

    }
}
