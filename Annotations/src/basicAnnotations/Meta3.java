package basicAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface anno3{
    String str() default "Testing";
    int val() default 9000;
}
// we have given default values to the members of the anno3 annotations


public class Meta3 {
    @anno3()
    public static void myMeth(){

        Meta3 ob = new Meta3();
        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            anno3 an = m.getAnnotation(anno3.class);
            System.out.println(an.str());
            System.out.println(an.val());
        } catch (NoSuchMethodException e){
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
