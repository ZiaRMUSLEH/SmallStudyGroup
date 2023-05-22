package day18inheritance;

public class Employee extends Member {
    String specialisation;

    public static void main (String[] args) {
        Employee employee = new Employee();

        System.out.println(employee.name="Ali");
        System.out.println(employee.age=30);
        System.out.println(employee.specialisation="doctor");
    }
}
