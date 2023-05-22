package day18inheritance;

public class Man extends Person {
    String job= "QA";

    public Man () {


    }

    public Man(String name, int age, String address, String job){
       super(name, address);
        this.job=job;
        this.age = age;
    }

    public static void main (String[] args) {
        Man man = new Man("Adam", 19, "USA", "DEV");
        System.out.println(man.name);
        System.out.println(man.job);
        System.out.println(man.age);
        System.out.println(man.address);

    }
}
