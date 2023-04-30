/* Exercise:
Write a program which finds if a string is a palindrome string or not.
- Palindrome string is a string that reads the same strating from either direction.
    - Example: noon, ababa, 1234321......
 */

public class Loop10 {

    public static void main(String[] args) {
        String str = "noon";
        String str2 = "some text";

        /* Usual long method:
        int j = str.length() - 1;
        for (int i = 0; i < j; i++) {
            j--;
        }
         */

        // Exercise 1:
        boolean isPalindrome = true;
        // Combine i and j by declaring two variables; i and j.
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) { // Keep iterating as long as i is less than j.
            if (str.charAt(i) == str.charAt(j))
                continue;
            isPalindrome = false;
            break;
        }
        // if condition is true, it is palindrom; if false, it is not palindrome.
        System.out.println(isPalindrome ? "palindrome" : "not palindrome");

        // Exercise 2:
        for (int i = 0, j = str2.length() - 1; i < j; i++, j--) { // Keep iterating as long as i is less than j.
            if (str2.charAt(i) == str2.charAt(j))
                continue;
            isPalindrome = false;
            break;
        }
        // if condition is true, it is palindrom; if false, it is not palindrome.
        System.out.println(isPalindrome ? "palindrome" : "not palindrome");
    }
}
