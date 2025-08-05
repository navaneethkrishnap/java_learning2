public class o63_lamda2 {

    public static void main(String[] args){
//        LambdaInterface interObj = new LambdaInterface() {
//            @Override
//            public void message() {
//                System.out.println("Hello, Navi!");
//            }
//        };
        // instead of writing long code like above you can write
        String name = "Navi";
        char symbol = 'N';
        LambdaInterface interObj2 = (n,s) -> { System.out.println("Hello "+s+"!");
            System.out.println("It is a nice day,init? " + n );};
        interObj2.message(name,symbol);
    }
}
