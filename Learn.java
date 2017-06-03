package main.java;

/**
 * Created by collinm on 6/2/17.
 */
public class Learn {

    public static void main(String[] args) {
        int[] intArgs = convertArrayToInt(args);
        /* testPassByReference(intArgs); **/
        quickSort(intArgs, 0, intArgs.length - 1);

        printIntArray(intArgs);
    }

    private static int[] convertArrayToInt(String[] input) {
        int[] result = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            try {
                result[i] = Integer.parseInt(input[i]);
            } catch (NumberFormatException e) {
                System.out.println(input[i] + " isn't a number!");
                return new int[0];
            }
        }

        return result;
    }

    private static void testPassByReference(int[] input) {
        /**
         * I used this to see if array values are referenced
         */
        if (input.length > 0) {
            input[0] = 5;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static int partition(int[] a, int lo, int hi) {
        int pivot = a[hi];
        int i = lo - 1;

        for (int j = lo; j < hi - 1; j++) {
            if (a[j] <= pivot) {
                i += 1;

                if (i != j) {
                    swap(a, i, j);
                }
            }
        }
        i += 1;
        swap(a, i, hi);

        return i;
    }

    private static void printIntArray(int[] a) {
        for (int i: a) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int p = partition(a, lo, hi);
            quickSort(a, lo, p - 1);
            quickSort(a, p+1, hi);
        }
    }

}