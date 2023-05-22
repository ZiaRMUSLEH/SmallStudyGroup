package day18inheritance;

public class Person {
    String name = "John";
    int age;
    protected String address;
    private int id;

    public Person () {
    }

    public Person (String name, String address) {
        this.name=name;
        this.address=address;
    }
}
