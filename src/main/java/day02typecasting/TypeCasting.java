package day02typecasting;

public class TypeCasting {
    public static void main (String[] args) {

        byte bt = 127;
        int num = bt;

        System.out.println(bt);
        System.out.println(num);
        System.out.println();

        int st = 128;
        byte bt2 = (byte) st;
        System.out.println(bt2);

        System.out.println();

        float ft = 77.4f;
        int num2 = (int) ft; // decimal part will be skipped
        System.out.println(num2);



    }
}
