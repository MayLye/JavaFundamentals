// Title: Char data type in Java

public class Main {

    public static void main(String[] args) {
        char c1 = 'A'; // This is character A.
        char c2 = 67; // This integer 65 will be converted to the correct character
        char c3 = '\u0044'; // u stands for unicode character.
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int code1 = 'A'; // A will be converted to the correct integer, which is 65.
        int code2 = '\u0047'; // This unicode \u0047 will be converted to the correct integer, which is 71.
        System.out.println(code1);
        System.out.println(code2);
    }

}