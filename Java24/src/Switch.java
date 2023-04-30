// Title: SWITCH Statement -> Used to execute different cases based on equality.

/*
switch (expression) {
    case exp1:
        statements
    case exp2:
        statements
    case expn:
        statements
    default:
        statements
 */

public class Switch {

    public static void main(String[] args) {
        System.out.println("Case 1: ");
        int n = 90; // all the cases after the input will be executed.
        switch (n) {
            case 10:
                System.out.println("=10");
            case 90:
                System.out.println("=90");
            case -3:
                System.out.println("=-3");
            default:
                System.out.println("None of the above.");
        }

        System.out.println();

        System.out.println("Case 2: ");
        int m = 6;
        switch (m) {
            case 10:
                System.out.println("=10");
            case 90:
                System.out.println("=90");
            case -3:
                System.out.println("=-3");
            default:
                System.out.println("None of the above.");
        }

        System.out.println();

        System.out.println("Case 3: ");
        int p = 40;
        switch (p) {
            case 10:
                System.out.println("=10");
                break;
            case 90:
                System.out.println("=90");
                break;
            case -3:
                System.out.println("=-3");
                break;
            default:
                System.out.println("None of the above.");
        }
    }
}

// Switch: more than one case may be executed.
// Break: when a break statement is reached, the switch terminates and jump to the next switch statement.
