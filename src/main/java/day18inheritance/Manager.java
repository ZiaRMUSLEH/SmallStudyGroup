package day18inheritance;

public class Manager extends Member {
    String department;

    public static void main (String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.name="Tom");
        System.out.println(manager.age=45);
        System.out.println(manager.department="PO");
    }
}
