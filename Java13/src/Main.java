// Title: Calling String Methods

public class Main {

    public static void main(String[] args) {
        String s1 = "Big Kids Academy";
        String s0 = "    ";
        String sA = "abcdefa";

        // toUpperCase(), toLowerCase()
        System.out.println(s1.toUpperCase());
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        System.out.println(s1); // not modified, original style.

        // s1.length()
        int i = s1.length(); // number of characters inside the String.
        System.out.println(i);

        // isEmpty()
        System.out.println(s0.isEmpty()); // return Boolean
        System.out.println(s0.isBlank()); // return Boolean
        System.out.println(s1.isEmpty()); // return Boolean
        System.out.println(s1.isBlank()); // return Boolean

        // charAt
        char c = sA.charAt(0);
        char c1 = sA.charAt(2);
        System.out.println(c);
        System.out.println(c1);

        // indexOf(), lastIndexOf()
        System.out.println(sA.indexOf('a')); // return index position of character 'a' inside sA.
        System.out.println(sA.indexOf('d')); // return index position of character 'd' inside sA.
        System.out.println(sA.indexOf('h')); // return index position of character 'h' inside sA which doesn't exist, result is -1.
        System.out.println(sA.lastIndexOf('a')); // return the postion of the last 'a' inside sA.

        // concat(), Concat means Join
        String s3 = s1.concat(" Concat"); // add Concat to s1 string.
        System.out.println(s3);
        System.out.println("Big".concat(" Kids").concat("5"));
        System.out.println("Big".concat(" Kids").concat("5").isEmpty());

    }


}