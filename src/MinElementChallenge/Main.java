package MinElementChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = readIntegers(3);
        System.out.println("Smallest value is: " +  findMin(myArray));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter values:\r");
        for (int i=0; i<count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i=0; i< array.length-1; i++) {
            if (min > array[i+1]) {
                min = array[i+1];
            }
        }
        return min;
    }
}
