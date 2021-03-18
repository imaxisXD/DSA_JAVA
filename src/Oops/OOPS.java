package Oops;

public class OOPS {
    public static void main(String[] args) {
        Dev d1 = new Dev(21, "Ichigo");
        System.out.println(d1.age + " " + d1.name);
        d1.eat();
        d1.walk();

        Person p2 = new Person(22, "Future Sunny");

        System.out.println(p2.age + " " + p2.name);
        p2.eat();
        p2.walk();

    }
}
class Person {
    String name;
    int age;
    static int count;


    public Person(int age, String name){

        this.age = age;
        this.name = name;
    }

    void walk(){
        System.out.println( name + " chal rha hai");
    }
    void eat(){
        System.out.println( name + " khana kha rha hai");
    }
}

class Dev extends  Person {

    public Dev(int age, String name) {
        super(age, name);
    }
    void walk(){
        System.out.println( "DEV " + name + " chal rha hai");
    }
}