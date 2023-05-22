package day1415constructors;

public class Person {

    public String name;
    public int age;
    public String job;
    public String hobbies;
    public boolean isSuccesfull;

    public Person(){

    }

    public Person (String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person (String name, int age, String job, String hobbies, boolean isSuccesful) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.hobbies=hobbies;
        this.isSuccesfull=isSuccesful;
    }

    public Person (String name, int age) {
        this.name=name;
        this.age=age;
    }

    public static void main (String[] args) {
        Person man = new Person();
        System.out.println(man.name= "john");
        System.out.println(man.age= 20);
        System.out.println(man.job="BA");


        Person woman = new Person();
        System.out.println(man.name= "Lily");
        System.out.println(man.age= 24);
        System.out.println(man.job="QA");

        Person girl = new Person("Emily", 12, "Student");
        Person boy = new Person("Adam", 10, "Student", "cycling", true);
        System.out.println(boy.hobbies);

    }
}
