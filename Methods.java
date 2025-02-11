import java.util.Scanner;


public class Methods {
    public static void processNumbers(int num1, int num2, int num3) {
        int sum = sum(num1, num2, num3);
        int max = max(num1, num2, num3);
        int min = min(num1, num2, num3);
        double average = average(sum);
        boolean allPositive = positive(num1, num2, num3);
        printing(sum, max, min, average, allPositive, num1, num2, num3);
    }    
    
    // Calculate sum
    public static int sum(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum;
    }
        // Find max
    public static int max(int num1, int num2, int num3){
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
        // Find min
    public static int min(int num1, int num2, int num3){
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }
        // Calculate average
    public static double average(int sum){
        double average = sum / 3.0;
        return average;
    }
        // Check if all numbers are positive
    public static boolean positive(int num1, int num2, int num3){ 
        boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        return allPositive;
    }
        // Print results
    public static void printing(int sum, int max, int min, double average, boolean allPositive, int num1, int num2, int num3){
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");
    }
    
    public static void getUserInput() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 3 numbers separated by spaces: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        processNumbers(num1, num2, num3);
        scan.close();
    }
    
    public static void main(String[] args) {
        getUserInput();
    }
    
}
