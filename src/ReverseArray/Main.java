package ReverseArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[] {1, 2, 3};
        System.out.println("my array = " + Arrays.toString(myArray));
        reverse(myArray);
        System.out.println("reversed = " + Arrays.toString(myArray));

    }

    public static void reverse(int[] array) {
//        for (int i=0; i< array.length; i++) {
//            array[i] = array[array.length - (1 + i)];
//        }
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
