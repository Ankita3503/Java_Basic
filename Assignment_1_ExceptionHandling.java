//Handle exception in number
//        Problem statement:
//        Get the input String from user and parse it to integer,
//        if it is not a number it will throw number format exception
//        Catch it and print "Entered input is not a valid format for " +
//        "an integer." or else print the square of that number.
//        (Refer Sample Input and Output).
//        Sample input and output 1:
//        Enter an integer: 12
//        The square value is 144
//        The work has been done successfully
//        Sample input and output 2:
//        Enter an integer: Java
//        Entered input is not a valid format for an integer.

import java.util.Scanner;

class Assignment_1_ExceptionHandling{
    public static void main(String[] args) {
        // for UserInput
        Scanner sc = new Scanner(System.in);
//        Inside the try block we write the high risk code
        
        try {
            //we can get the Input from the User as a string type
            String i= sc.next();
            // we can convert the String into the the Integer wrapper classs
          int k =Integer.parseInt(i);
            System.out.println("The squre value of :"+(k*k));
            System.out.println("Your programe is run sccessfully");
        }
        catch (NumberFormatException obj) {
            System.out.println(obj+"\nEntered input is not a valid format for an Integer");
        }
    }
}
