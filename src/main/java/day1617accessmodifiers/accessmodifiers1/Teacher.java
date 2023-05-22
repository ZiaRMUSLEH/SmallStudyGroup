package day1617accessmodifiers.accessmodifiers1;

public class Teacher extends Student {
    public static void main (String[] args) {
        Student s1 = new Student();
        System.out.println(s1.phone);
        System.out.println(s1.name);
        System.out.println(s1.field);
    }
}
