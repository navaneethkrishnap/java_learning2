package coreJava.enumerations;


enum Apple{
    J, S, N, A, M;
}
public class EnumDemo {
    public static void main(String[] args) {
        {
            Apple ap;
            ap = Apple.N;

            System.out.println("Value of ap: "+ ap);
            System.out.println();

            ap = Apple.A;

            // compare 2 enums
            if(ap == Apple.A){
                System.out.println("ap contains Arun \n");
            }

            switch(ap){
                case J:
                    System.out.println("ap is Jagan");
                    break;

                case S:
                    System.out.println("ap is Shiva");
                    break;

                case N:
                    System.out.println("ap is Navaneeth");
                    break;

                case A:
                    System.out.println("ap is Arun");
                    break;
                case M:
                    System.out.println("ap is Manoj");
                    break;
            }
        }
    }
}
