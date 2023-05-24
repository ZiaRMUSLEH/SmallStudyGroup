package day20encapsulation;

public class Employee {
    /*
    create an employee class with 3 attributes: name, age, and salary. make it read only
    create public method to modify the salary attribute. also create a separate increaseSalary() method
    that increases the salary by a specified percentage. increase the salary of the employee by 10%.
    create an instance of employee in EmployeeManagementSystem class and
    demonstrate controlled through encapsulation
     */

    private String name;
    private int age;
    private double salary;

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public double getSalary () {
        return salary;
    }

    public Employee (String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public void setSalary (double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        salary =salary+ salary*(percentage/100);
    }
}
