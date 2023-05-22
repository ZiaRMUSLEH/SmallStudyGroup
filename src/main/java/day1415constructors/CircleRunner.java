package day1415constructors;

public class CircleRunner {

    public static void main (String[] args) {

        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle(12);
        Circle c3 = new Circle(24);

        c1.display();
        c2.display();
        c3.display();

        System.out.println(c1.getArea());

        System.out.println("*************");
        Circle c4 = new Circle();
        Circle c5 = new Circle();
        System.out.print(c4.getArea());
        System.out.print(c5.getArea());


    }
}
