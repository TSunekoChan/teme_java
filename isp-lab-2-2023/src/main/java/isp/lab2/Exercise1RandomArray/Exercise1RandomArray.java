package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(1000);
        }

        return array;
    }

    public static int[] findMaxAndMin(int[] array) {
        int[] mm = new int[2];
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        mm[0] = min;
        mm[1] = max;

        return mm;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMaxAndMin(a);

        System.out.println("Min is: " + mm[0] + " Max is: " + mm[1]);
    }
}