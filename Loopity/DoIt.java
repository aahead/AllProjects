// BEGIN
import java.util.Scanner;

public class DoIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declare a variable for user input
        int input = 1;
        // REPEAT AT LEAST ONCE
        // DO
        do { 
            if (input < 0){
                System.out.println("Negative number inputted try again");
            } else if(input == 0)
            {
                System.out.println("0 is not positive silly");
            }
            System.out.print("Enter the most positive of positive numbers pleassse :) ");
            //     Prompt the user to enter a positive number
            input = scan.nextInt();
            //     Read input
        } while ((input < 0) || (input == 0)); // WHILE (input is negative)
        
        System.out.println("THAT IS THE BEST POSITIVE NUMBER EVERRRR!");
        // Display valid input message

        // END
    }
}

