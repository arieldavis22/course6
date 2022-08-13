package ReferenceValueTypes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntVal = 10;
        int anotherVal = myIntVal;

        System.out.println("myIntVal = " + myIntVal);
        System.out.println("anotherVal = " + anotherVal);

        anotherVal++;

        System.out.println("myIntVal = " + myIntVal);
        System.out.println("anotherVal = " + anotherVal);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
