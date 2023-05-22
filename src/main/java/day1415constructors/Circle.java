package day1415constructors;

public class Circle {
    /*
    Design a class named circle
    construct three circle objects with radius 2.0, 12 and 24 and display the radius and area of each.
    A no_arg constructor sets the default value of radius to 1.
    A getArea() method is used to return the area of circle.
     */
    double area;
    double radius;

   public Circle (){
       this.radius=1;
    }
    public Circle (double x){
        radius=x;
        area = 3.1416*radius*radius;
    }

    public void display(){
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+area);
    }

    public double getArea(){
       area = 3.1416*radius*radius;
       return area;
    }



}
