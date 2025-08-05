package customAnnotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // kept at runtime
@Target(ElementType.METHOD) // usable as methods
@interface Todo{
    String value();
    String assignedTo() default "unassigned";
    int priority() default 1;
}

class Work{
    @Todo( value = "Refactor this method later", assignedTo = "navi", priority = 5)
    public void doWork(){
        System.out.println("Doing work...");
    }
}
public class custom1 {
    public static void main(String[] args) {
        Work eg = new Work();
        eg.doWork();
    }
}
