package day19inheritance;

public class Person {
    String name;
    int age;

    public Person () {
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void duties (){
        System.out.println("this is just a person");
    }

}
