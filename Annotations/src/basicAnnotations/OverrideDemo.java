package basicAnnotations;

class Animal{
    public void speak(){
        System.out.println("annotationsExample.Animal sound.");
    }
}

class Dog extends Animal{

    @Override
    public void speak(){
        System.out.println("Woof!");
    }
}

interface Flyer{
    void fly();
}

class Bird implements Flyer{

    @Override
    public void fly() {
        System.out.println("Flap flap");
    }
}
public class OverrideDemo {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
    }
}


