/* Exercise:
Write a program which displays a string with a space after each character:
ab cd -> a b   c d
some text -> s o m e  t e x t
Rmbr to use charAt() method.
 */

/* Algorithm:
    1-Iterate over the string using a loop.
    2-Display each character concatenated with a space.
 */

public class Loop08 {

    public static void main(String[] args) {
        String str = "ab cd";
        String str2 = "s o m e  t e x t";
        /*
        Index of character a is 0;
        Index of character b is 1;
        Index of character   is 2;
        Index of character c is 3;
        Index of character d is 4;
         */

        for (int i = 0; i <= str.length() - 1; i++) { // use for loop to iterate over string str.
            /*
            (i=0) -> Variable i starts from 0, since the index of the first character in the string is 0.
            (i<=str.length()-1) -> The last character in the string is the length of the string minus 1.
                                -> Iterate from i=0 up until the length of the string minus 1.
             */
            System.out.println(str.charAt(i) + " "); // concatenate character with space.
            System.out.println(str2.charAt(i) + " "); // concatenate character with space.
        }

    }
}
