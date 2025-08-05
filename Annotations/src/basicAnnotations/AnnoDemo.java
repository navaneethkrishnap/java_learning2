package basicAnnotations;

class A{
    public void show(){
        System.out.println("in annotationsExample.A Show");
    }
}

class B extends A{
    public void shows(){
        System.out.println("in annotationsExample.B Show");
    }
}


class AnnoDemo {
    public static void main(String[] args){
        B b = new B();
        // annotationsExample.A a = new annotationsExample.A();

        b.show();
        // a.show();
    }
}