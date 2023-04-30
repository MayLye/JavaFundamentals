/* Exercise 1:
Write a program which displays the reverse of a string.
    - abcd -> dcba
    - some text -> txet emos
 */
/* Algorithm 1:
    1-Iterate over the string from last character to the first character.
    2-Display each character.
 */

/* Exercise 2:
Reverse the string in a new string called reverse, then display reverse.
 */
/* Algorithm 2:
    1-Iterate over the string from last character to the first character.
    2-Concatenate each character to reverse.
    3-Display reverse.
 */

public class Loop09 {

    public static void main(String[] args) {
        String str = "some text";

        System.out.println("Exercise 1: ");
        for (int i = str.length() - 1; i >= 0; i--) { // Iterate from last character to first character.
            /*
            (i = str.length() - 1) -> variable i that starts from length minus 1.
            (i >= 0; i--) -> Keep decrementing i until we reach 0.
             */
            System.out.println(str.charAt(i));
        }
        System.out.println();
        System.out.println("Exercise 2: ");
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) { // Iterate from last character to first character.
            reverse += str.charAt(i);
            System.out.println(reverse);
        }

    }
}
