// Title: Command Line Arguments: 
// Pass arguments to our program using command window. Data given to the main method.

class Main {

    //String[] args: is a group of strings, and this group is called 'args' which is an abbreviation for arguments.
    public static void main(String[] args) {

        // Each argument will be a string.
        System.out.println(args[0]);// Print the first argument of the string.
        System.out.println(args[1]);// Print the second argument of the string.
        System.out.println(args[2]);// Print the third argument of the string.
        // To print out above arguments, rmbr to Right-click to select Modify Run Configurations and add arguments to the Program Arguments.
    }
}

/*
To run in command line, copy and paste this Main.java to your desktop. Look for your file directory.
For me, the directory is C:\Users\User\OneDrive\Desktop.
1) In the command line, type cd followed by your source directory. For me is cd C:\Users\User\OneDrive\Desktop.
2) If no error, type dir.
3) To compile Java, type javac. Now you should see Main.class in your desktop.
4) To print out your program, type java Main. Don't need extension.
 */