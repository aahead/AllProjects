// necessary imports go here
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class ArraySearch {

    public static void main(String[] args) {
        // TODO: Get array size from user using Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number for how long you would like the array to be: ");
        int arraySize = scan.nextInt();
        // TODO: Validate input to ensure a positive integer for array size
        while (arraySize < 0){
            System.out.print("Really, you want a negative sized list? How about you try again: ");
            arraySize = scan.nextInt();
        }
        // TODO: Create an array of the specified size and fill with random numbers
        int[] randArray = new int[arraySize];
        Random rand = new Random();
        for (int i = 0; i < randArray.length; i++){
            randArray[i] = rand.nextInt(1, 1001);
        }
        // TODO: Get target number from user using Scanner
        System.out.print("What number do you want to find from the array?: ");
        int targetNum = scan.nextInt();
        // TODO: Validate input to ensure a positive integer for the target number if found, -1 if not
        while (targetNum < 0){
            System.out.print("This has to be a bit you're doing right? PLEASE enter a positive number so I can go home: ");
            targetNum = scan.nextInt();
        }
        // Linear Search
        System.out.println("Starting linear search...");
        long linearStartTime = System.nanoTime();

        // TODO: Implement linear search to find the index of the target number
        int check = 1;
        for (int i = 0; i < randArray.length; i++){
            if (targetNum == randArray[i]){
                check = i;
                break;
            } else{
                check = -1;
            }
        }
        System.out.println("The index of your number is: " + check);

        long linearEndTime = System.nanoTime();
        System.out.println("Linear search took " + (linearEndTime - linearStartTime) + " nanoseconds.");

        // Sort the array using built-in method of the Arrays class
        System.out.println("Sorting the array...");
        // TODO: Sort the array as specified above
        Arrays.sort(randArray);
        // Binary Search
        System.out.println("Starting binary search...");
        long binaryStartTime = System.nanoTime();

        // TODO: Implement binary search to find the index of the target number if found, -1 if not
        int answer = java.util.Arrays.binarySearch(randArray, targetNum);
        if (answer < 0){
            System.out.println("The index of your number is: " + -1);
        } else{
            System.out.println("The index of your number is: " + answer);
        }

        
        long binaryEndTime = System.nanoTime();
        System.out.println("Binary search took " + (binaryEndTime - binaryStartTime) + " nanoseconds.");
        
        if ((binaryEndTime - binaryStartTime) < (linearEndTime - linearStartTime)){
            System.out.println("Binary search was faster.");
        } else{
            System.out.println("Linear search was faster.");
        }

        // TODO: Display the result of the binary search (index or not found)

        // TODO: Display results specified in Display Output section
    }
}
