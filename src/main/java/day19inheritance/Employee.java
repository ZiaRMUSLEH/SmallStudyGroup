package day19inheritance;

public class Employee extends Person {

    String field;
    String department;
    long id;

    public Employee () {
    }

    public Employee ( String name, int age,String field, String department, long id) {
        super(name, age);
        this.field = field;
        this.department = department;
        this.id = id;
    }

    public static void main (String[] args) {
        Employee e1 = new Employee("Kay", 25, "UI eng", "Engineering", 234);
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.field);
        System.out.println(e1.department);
        System.out.println(e1.id);

        Student s1 = new Student();
        s1.duties();

        Person p1 = new Person();
        p1.duties();

        e1.duties();

    }

    @Override
    public void duties () {
        System.out.println("this employee works");
    }
}
