package ArraysChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        int[] sortedArray = sortIntegers(myIntegers);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("element" + i + ", value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] newArray = new int[array.length];
//
//        for (int i=0; i<array.length; i++) {
//            newArray[i] = array[i];
//        }
        int[] newArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i< newArray.length-1; i++) {
                if(newArray[i] < newArray[i+1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }
}
