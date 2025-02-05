// BEGIN
import java.util.Random;
import java.util.Scanner;


public class GuessNumber{
    public static void main(String[] args){
        // Choose a hidden number
        Random rand = new Random();
        int ranNum = rand.nextInt(101);
        // Prompt the user to start guessing
        Scanner scan = new Scanner(System.in);
        System.out.print("I have diabolically and skillfully chosen a random number between 0 and 100 and you can not leave here until you have guessed it correctly. ");
        int guess = scan.nextInt();
        // Repeat until the correct guess is made
        // WHILE (true) DO
        while (guess != ranNum) { 
            if (guess < ranNum){
                System.out.print("Your guess is too low, try again: "); //     Ask for a guess
                guess = scan.nextInt(); //     Get user input
            } else{
                System.out.print("Your guess is too high, try again: "); //     Ask for a guess
                guess = scan.nextInt(); //     Get user input
            }
        }
        System.out.println("I'm not gonna lie I really did not think you were gonna guess that number, but you have, so HOORAY!!!!");
        

        scan.close();
    }
}

