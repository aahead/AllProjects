import java.util.Scanner;
import java.util.Random;

public class Arrays {
    public static void main(String[] args){
        empArray();
        filledArray();
        oneLine();
        forArray();
        charArray();
        randomArray();
    }
    public static void empArray(){
        int[] numbers;
        numbers =  new int[5];
        System.out.println(java.util.Arrays.toString(numbers));
    }
    public static void filledArray(){
        int[] numbers;
        numbers =  new int[5];
        numbers[0] = 21;
        numbers[1] = 12;
        numbers[2] = 22;
        numbers[3] = 11;
        numbers[4] = 2;
        System.out.println(java.util.Arrays.toString(numbers));
    }
    public static void oneLine(){
        int[] numbers = new int[5];
        numbers[0] = 21;
        numbers[1] = 12;
        numbers[2] = 22;
        numbers[3] = 11;
        numbers[4] = 2;
        System.out.println(java.util.Arrays.toString(numbers));
    }
    public static void forArray(){
        int[] numbers = new int[5];
        int count = 0;
        for (int i = 3; count < numbers.length; i = i *3){
            numbers[count] = i;
            count++;
        }
        System.out.println(java.util.Arrays.toString(numbers));
    }
    public static void charArray(){
        char[] charArray = new char[5];
        charArray[0] = 'A';
        int number = 65;
        for (int i = 1; i < charArray.length; i++){
            number = number + 2;
            charArray[i] = (char) number;
            
        }
        System.out.println(charArray);
    }
    public static void randomArray(){
        Scanner scan = new Scanner(System.in);
        System.out.print("PLEEEEEEASSSE enter an integer value: ");
        int number = scan.nextInt();
        int[] array = new int[number];
        for(int i = 0; i < array.length; i++){
            Random rand = new Random();
            int newNum = rand.nextInt(1, 101);
            array[i] = newNum;
        }
        System.out.println(java.util.Arrays.toString(array));
    }
}
