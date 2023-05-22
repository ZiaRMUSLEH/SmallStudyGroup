package day1617accessmodifiers.accessmodifiers2;

import day1617accessmodifiers.accessmodifiers1.Student;

public class Teacher3 extends Student {
    public static void main (String[] args) {

        Student s1 = new Student();
        System.out.println(s1.name);

        Teacher3 st =  new Teacher3();
        System.out.println(st.phone);
        System.out.println(st.name);


    }
}
