// Title: Reading input from keyboard.

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float f = input.nextFloat();
        System.out.println(f);
        int g = input.nextInt();
        System.out.println(g + 10);
    }

}
