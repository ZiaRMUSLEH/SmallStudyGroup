package day1617accessmodifiers.accessmodifiers1;

public class Student {
    public String name = "Shabnam";
    String field = "IT";
    private int id = 222;
    protected int phone = 123456789;

    public static void main (String[] args) {

        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.field);
        System.out.println(s1.id);
        System.out.println(s1.phone);
    }
}
