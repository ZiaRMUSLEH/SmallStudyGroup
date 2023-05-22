package day1415constructors;

public class Student extends Person {
    String major;
    double grade;

    Student (String name, int age, String major, double grade){
        super(name, age);
        this.major=major;
        this.grade=grade;
    }

    public static void main (String[] args) {
        Student s1 = new Student("Mark", 20, "Computer Science", 4.0);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.major);
        System.out.println(s1.grade);

    }

}
