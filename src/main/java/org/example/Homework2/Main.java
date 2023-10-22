package org.example.Homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[] {2, -1, 0, 2, 3, 0, 4};
        int[] array2 = new int[] {2, 2, 0, 0};
        int[] array3 = new int[] {1, 3, 5};

        System.out.println("Number of even elements:");
        System.out.println(Arrays.toString(array1) + " -> " + countEvens(array1));
        System.out.println(Arrays.toString(array2) + " -> " + countEvens(array2));
        System.out.println(Arrays.toString(array3) + " -> " + countEvens(array3));

        System.out.println("\nDifferense between max and min elements:");
        System.out.println(Arrays.toString(array1) + " -> " + getDifferense(getMax(array1), getMin(array1)));
        System.out.println(Arrays.toString(array2) + " -> " + getDifferense(getMax(array2), getMin(array2)));
        System.out.println(Arrays.toString(array3) + " -> " + getDifferense(getMax(array3), getMin(array3)));

        System.out.println("\nIs array have two '0' adjacent elements:");
        System.out.println(Arrays.toString(array1) + " -> " + findDouble0(array1));
        System.out.println(Arrays.toString(array2) + " -> " + findDouble0(array2));
        System.out.println(Arrays.toString(array3) + " -> " + findDouble0(array3));
    }

    private static int countEvens(int[] array) {
        int counter = 0;
        for (int element: array) {
            if (element % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int getMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    private static int getMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    private static int getDifferense(int a, int b) {
        return a - b;
    }

    private static boolean findDouble0(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] && array[i] == 0) {
                return true;
            }
        }

        return false;
    }
}
