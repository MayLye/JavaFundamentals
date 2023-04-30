// Title: Variables in Java

public class Main {

    public static void main(String[] args) {
        // myName is the variable. Rmbr to use camelCase.
        // Variable will allocates some space in our memory, and this space will be called myName.
        String myName;
        // Initialize the variable before using it.
        myName = "Big Kids";
        /* Declare the variable in short form:
        String myName = "Big Kids";
         */
        String myJob = "Programmer";
        String myNameCopy = myName;
        // Assign a new string to myName variable.
        myName = "Another name";

        System.out.println(myName);
        System.out.println(myJob);
        System.out.println(myNameCopy);


        // Select and Right-click to Modify Run Configuration. Add variables to the Program Arguments.
        String arg1 = args[0]; // first argument
        System.out.println(arg1);
        System.out.println(args[1]); // second argument
    }

}