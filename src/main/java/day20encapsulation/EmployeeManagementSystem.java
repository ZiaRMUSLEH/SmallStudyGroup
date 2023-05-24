package day20encapsulation;

public class EmployeeManagementSystem {
    public static void main (String[] args) {

        Employee e1 = new Employee("john", 24, 1000);
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());

        e1.setSalary(1500);
        System.out.println("Updated salary : = "+e1.getSalary());

        e1.increaseSalary(15);
        System.out.println("Increased salary: = "+e1.getSalary());

    }
}
