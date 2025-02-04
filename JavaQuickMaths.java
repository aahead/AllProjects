// Import necessary classes
import java.util.Scanner;
import java.lang.Math;

public class JavaQuickMaths {
    public static void main(String[] args)    {
        Scanner scan = new Scanner(System.in);
        
        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        for (double i = 1.0; i <= 5.0; i = i + 0.5){
            System.out.print("Number: " + i + " ");
        //    - Print the number
        //    - Apply and print results of:
        System.out.print("Ceil: " + Math.ceil(i) + " ");
        System.out.print("Floor: " + Math.floor(i) + " ");
        System.out.print("Rint: " + Math.rint(i) + " ");
        System.out.println("Round: " + Math.round(i));
        

        }
        System.out.println("__________________________________________________________________");
        // 2. Prompt the user to enter a decimal number
        System.out.print("Enter a number with a decimal pretty pwease ;): ");
        double decNum = scan.nextDouble();
        //    - Store the number
        //    - Print the rounding results (ceil, floor, rint, round)
        System.out.print("Ceil: " + Math.ceil(decNum) + " ");
        System.out.print("Floor: " + Math.floor(decNum) + " ");
        System.out.print("Rint: " + Math.rint(decNum) + " ");
        System.out.println("Round: " + Math.round(decNum));
        System.out.println("__________________________________________________________________");
        // 3. Prompt the user to enter an integer
        System.out.print("Enter a integer pretty pwease with a biiiiig cherry on top ;): ");
        int num = scan.nextInt();
        System.out.print("Enter the most wonderous and beautiful string of words and letters you can imagine!!: ");
        String input = scan.next();
        System.out.println("Your beautiful number and string have been delivered back to you sire: " + num  + " " + input);
        
        System.out.println("__________________________________________________________________");

        //    - Store the integer
        //    - Prompt the user to enter a string
        //    - Store the string
        //    - Print the entered integer and string

        
        // 4. Demonstrate type casting
        //    - Convert the integer to double (implicit cast) and print
        double doubleNum = num;
        System.out.println("The integer you entered has been cast to.... " + doubleNum);
        //    - Convert the decimal number to int (explicit cast) and print
        int intNum = (int)decNum;
        System.out.println("The decimal value that you entered has been cast to.... " + intNum);
        //    - Convert the integer to a char (ASCII representation) and print
        char numChar = (char)num;
        System.out.println("The integer value that you entered has been cast to.... " + numChar);
        
        System.out.println("__________________________________________________________________");

        // 5. Prompt the user to enter a character
        System.out.print("Enter the greatest character in the world which only you can do!!!!: ");
        char charPut = scan.next().charAt(0);
        System.out.println();
        int intChar = (int)charPut;
        System.out.println("I have just changed your character to " + intChar + " HAHAHAHHA!!!!");
        //    - Store the character
        //    - Convert the character to its ASCII value (int) and print
        
        // 6. Demonstrate String vs. new String()
        System.out.println("__________________________________________________________________");

        String big = "WAAA";
        String small = "WAAA";
        String medium = new String("WAAA");
        System.out.println("I have created two strings now are they equal??? " + (big == small));
        System.out.println("A new string has entered the arena now does it match up with the others??? " + (big == medium));
        System.out.println("Now the real question are they equal in strength???? " + big.equals(medium));
        //    - Create a String literal and assign it to two variables
        //    - Create another String using new String()
        //    - Compare the first two strings using == (reference check)
        //    - Compare one literal with the new String() object using ==
        //    - Compare the content of both strings using .equals()
        //    - Print the results
        
        // Close the Scanner object
        scan.close();
    }
}
