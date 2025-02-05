// BEGIN
import java.util.Random;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Random rand = new Random();
        // Generate two random numbers between 0 and 9
        int number1 = rand.nextInt(10); // SET number1 = RANDOM(0-9)
        int number2 = rand.nextInt(10); // SET number2 = RANDOM(0-9)

        Scanner scan = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? "); // Prompt user for input
        // PRINT "What is " + number1 + " + " + number2 + "? "

        int guess = scan.nextInt(); // READ answer

        while (guess != (number1 + number2)){ // Keep asking until the user gets it right

            System.out.println("Wrong answer, nice try silly, hows about you give it another chance?"); //     PRINT "Wrong answer. Try again. What is " + number1 + " + " + number2 + "? "

            System.out.print("What is " + number1 + " + " + number2 + "? ");
            guess = scan.nextInt(); //     READ answer

        } // END WHILE

        System.out.println("OMG you... you actually guessed correctly, MOM!! GET THE CAMERA!!!"); // Correct answer message

        scan.close();
    }
}

// END
