// Title: Integers Data Types in Java (Practice)

public class Main {

    public static void main(String[] args) {
        byte b1 = 5; // min -128, max 127
        // byte b2 = -129; error, it is an integer, out of range for byte.
        short s1 = 20;
        int i1 = 100;
        long l1 = 99999999999L; // 'L' means long. Without putting L, error will be shown.

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        System.out.println(b1 - i1);
        System.out.println(s1 - b1);
        System.out.println(i1 - l1);

        l1 = i1;
        System.out.println(i1);
        System.out.println(l1);
    }

}