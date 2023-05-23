package day19inheritance;

public class Student extends Person {
    String major;
    long id;

    Student(){}


    public Student (String name, int age, String major, long id) {
        super(name, age);
        this.major= major;
        this.id = id;
    }

    public Student (String name, int age) {
        super(name, age);
    }

    public static void main (String[] args) {
        Student s1 = new Student("Jonathan",24, "computer science", 54545456456l);
        Student s2 = new Student("Kaley",23, " biology", 5456464);
        Student s3 = new Student();
        s3.name = "John";
        s3.age = 22;
        s3.major= "CS";
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.major);
        System.out.println(s1.id);
        System.out.println("*************");
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.major);
        System.out.println(s3.id);
        s3.duties();
        Person p1 = new Person();
        p1.duties();





    }

    @Override
    public void duties () {
        System.out.println("this student studies");
    }
}



