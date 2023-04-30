// Title: Concatenating Strings in Java

public class Main {

    public static void main(String[] args) {
        // Concat means Join
        String part1 = "Big";
        String part2 = "Kids";
        System.out.println(part1 + part2);
        System.out.println(part1 + " " + part2);
        System.out.println(part1 + " " + part2 + (6*2));

        System.out.println("Big".concat(" Kids").concat("5"));
        System.out.println("Big".concat(" Kids").concat("5").isEmpty());
    }

}
/*
When + is used with strings it acts as a concatenation operator.
When + operator is used only with numbers, it acts as an addition operator.
 */