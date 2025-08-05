import java.util.Random;

class Student {

    String name;
    int age;
    int standard;
    char section;
    Random random = new Random();

    Student(String n, int a, int s, char sec){
        this.name = n;
        this.age = a;
        this.standard = s;
        this.section = sec;
    }
    Student(String n, int a){
        this.name = n;
        this.age = a;
    }
    Student(){
        System.out.println("Please atleast enter name and age of the student.");
    }


    void rank(){
        int rank = random.nextInt(1000);
        System.out.println(this.name +" scored "+ rank +" in the JEXT examinations.");
    }
        }

public class o42_constructors {
    public static void main(String[] args){

        Student student00 = new Student("Navneeth",23,12,'A');
        Student student01 = new Student("Krishna", 22, 12,'A');

        System.out.println(student00.name);
        System.out.println(student01.name);

        student01.rank();


    }
}
