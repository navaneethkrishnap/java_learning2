package basicAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2{
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description();
}

@What(description = "An annotation test class")
@MyAnno2(str = "Meta2", val=99)
public class Meta2 {

    @What(description = "An annotation test method")
    @MyAnno2(str="Testing method", val=100)
    public static void myMeth3(){
        Meta2 ob = new Meta2();

        try{
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("ALL ANNOTATIONS FOR Meta2 class ");
            for(Annotation a : annos){
                System.out.println(a);
            }
            System.out.println();
            Method m = ob.getClass().getMethod("myMeth3");
            annos = m.getAnnotations();
            System.out.println("ALL ANNOTATIONS FOR myMeth3 method");
            for(Annotation x : annos){
                System.out.println(x);
            }
        } catch (NoSuchMethodException e){
            System.out.println("No such method exists");
        }
    }

    public static void main(String[] args) {
        myMeth3();
    }
}
