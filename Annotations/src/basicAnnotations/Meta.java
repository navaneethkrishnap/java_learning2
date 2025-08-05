package basicAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;



@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{ // custom annotation
    String str();
    int val();
}

public class Meta {

    // Annotate a method, this method has 0 parameter
    @MyAnno(str = "0 parameters", val = 0)
    public static void myMeth(){
        Meta ob = new Meta();

        try{
            Class<?> c = ob.getClass(); // class object that represent ob object
            Method m = c.getMethod("myMeth"); // method object that represent "myMeth" method
            MyAnno anno = m.getAnnotation(MyAnno.class); // annotation for the class
            System.out.println(anno.str());
            System.out.println(anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    // Annotate a method, this method has 2 parameters
    @MyAnno(str = "2 parameters", val = 2)
    public static void myMeth2(String str, int i){
        Meta ob2 = new Meta();

        try{
            Class<?> c = ob2.getClass();
            Method m = c.getMethod("myMeth2", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str());
            System.out.println(anno.val());
        } catch (NoSuchMethodException e){
            System.out.println("Method not found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
        myMeth2("Test",2);
    }
}


