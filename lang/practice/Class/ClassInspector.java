package lang.practice.Class;

import java.lang.reflect.*;
import java.util.concurrent.ExecutionException;

public class ClassInspector {
    public static void main(String[] args) throws Exception {

        Class<?> cls = MyClass.class;
        System.out.println("getName(): "+cls.getName());
        System.out.println("getSimpleName(): "+cls.getSimpleName());

        System.out.println("\nFields: ");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields){
            System.out.println(" - "+field.getName()+ " : "+ field.getType().getSimpleName());
        }

        System.out.println("\nMethods: ");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(" - "+ method.getName());
        }

        System.out.println("\nConstructors: ");
        Constructor<?>[] constructors = cls.getConstructors();
        for(Constructor<?> constuctor : constructors ){
            System.out.println(" - "+constuctor);
        }

        System.out.println("\nCreating Object using newInstance(): ");
//        Object obj = cls.newInstance(); // depracated
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method hello = cls.getDeclaredMethod("sayHello");
        hello.invoke(obj);


        System.out.println("\nisInterface(): "+ cls.isInterface());
        System.out.println("\ngetSuperclass(): "+ cls.getSuperclass().getName());
    }
}
