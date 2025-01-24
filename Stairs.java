import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Enter any Character: ");
        String stairChar = myObj.nextLine();  // Read user input
        
        System.out.println("Enter Number of Steps: ");
        int stepsNum = myObj.nextInt();  // Read user input
        
        String emptyString = " ";
        int count = 1;
      
        for (int i = stepsNum; i > 0; i--){
            System.out.println(emptyString.repeat(i-1) + stairChar.repeat(count)); 
            count++;
        }
    }
}
