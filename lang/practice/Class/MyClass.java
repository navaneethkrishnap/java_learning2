package lang.practice.Class;

public class MyClass {
    private int x;
    public String name;

    public MyClass() {}

    public MyClass(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from MyClass.");
    }

    private void secretMethod(){
        System.out.println("This is a private method.");
    }
}
