package lang.practice.cloneClass;

public class TestClone2 implements Cloneable{
    String name;
    int age;

    TestClone2(String n, int a){
        name = n;
        age = a;
    }
    @Override
    public Object clone() {
        try {
            return (TestClone2) super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println("Clone not supported.");
            return this;
        }
    }
}

class CloneDemo2 {
    TestClone2 t1 = new TestClone2("Navaneeth", 23);

    TestClone2 t2 = (TestClone2) t1.clone();
}
