import java.util.Scanner; // importing the input library
class CountDown {
    public static void main(String[] args) {
        myFunc(); // calling the function below
    }
    public static void myFunc(){ // creating a function to call in the main class
        
        
        Scanner scan = new Scanner(System.in); // initialize a scanner
        System.out.println("Enter a number: "); // ask the user to enter a number
        int num = 0;
        try{ // trying to validate whether or not the input is an int value
            
            num = scan.nextInt(); // checking the value entered by the user
            for (int i = num-1; i > 0; i--){ // a for loop to count down from the number entered by the user
                System.out.println(i); // printing the numbers to the screen
            }
            
        }catch (Exception e) { // this will catch a non numeric value that is entered as input
            System.out.println("Not a number try again"); // tells the user that the input was incorrect
        }
        scan.close(); // closes the scanner to prevent memory leaks
        
        
        
    }

}
