package day01datatypes;

public class WrapperClasses01 {
    public static void main(String[] args) {

        byte age = 25;
        System.out.println(age);

        Integer age2 = 54;
        byte newAge = age2.byteValue(); //Wrapper classes have a lot of useful methods but primitives not.

        int id = 5436;
        //Long newId = id; ==> it will complain because int and Long are not compatible
        Integer newId = id; // ==> it will not complain because int and Integer are compatible
        System.out.println(newId);







    }


}
