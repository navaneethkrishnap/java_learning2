
public class MakeString {
    public static void main(String[] args){
        String s = new String();
        char[] x = {'n','a','v','i'};
        String xStr = new String(x);
//        System.out.println(xStr);
        //
        byte ascii[] = {65,66,67,68,69,70};

        String s1 = new String(ascii);
//        System.out.println(s1);

        String s2 = new String(ascii,2,3);
//        System.out.println(s2);

        System.out.println("String length");
        System.out.println(s1.length());
        System.out.println("abc".length()); // creation of string object using string literal
        System.out.println("four :"+2+2);
        System.out.println("four :"+(2+2));

    }


}


