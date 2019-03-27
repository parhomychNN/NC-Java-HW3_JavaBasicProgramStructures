package ru.parhomych.netcracker.hw3jbps.task1sortarray;

import java.util.Arrays;

public class Task1sort {

    /*
     * Selection sort
     */
    public static void sortSelection(int[] arr) {
        for (int min = 0; min < arr.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
    }

    /*
     * Bubble sort
     */
    static void sortBubble(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    /*
     * Returns a random int array with n elements
     */
    public static int[] randomArray(int n){
        int[] result = new int[n];

        for (int i = 0; i < result.length; i++){
            result[i] = (int) Math.round(Math.random() * 1000);
        }

        return result;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static double nanosToMillis(long nanos){
        double millis = nanos / 1_000_000.00;
        return millis;
    }

    public static void doTheComparisonBetweenSortingMethods(int n, boolean showInfoAboutArrays){
        int[] array = randomArray(n);

        System.out.println();
        System.out.println("**************************************************************************");
        System.out.println();
        System.out.println("N = " + array.length);

        System.out.println("-------------------------- Selection sort --------------------------------");
        int[] array1 = array.clone();
        if(showInfoAboutArrays){
            System.out.println("Original array:");
            printArray(array1);
        }
        long startTime = System.nanoTime();

        sortSelection(array1);

        long endTime = System.nanoTime();
        long elapsedTimeSelecSort = endTime - startTime;
        if (showInfoAboutArrays){
            System.out.println("Sorted array:");
            printArray(array1);
        }
        System.out.println("elapsedTime = " + nanosToMillis(elapsedTimeSelecSort) + " ms"
                + " Start: " + startTime + " End: " + endTime);

        System.out.println("-------------------------- Arrays.sort() --------------------------------");
        int[] array2 = array.clone();
        if (showInfoAboutArrays){
            System.out.println("Original array:");
            printArray(array2);
        }
        startTime = System.nanoTime();

        Arrays.sort(array2);

        endTime = System.nanoTime();
        long elapsedTimeArrysSort = endTime - startTime;
        if (showInfoAboutArrays){
            System.out.println("Sorted array:");
            printArray(array2);
        }
        System.out.println("elapsedTime = " + nanosToMillis(elapsedTimeArrysSort) + " ms"
                + " Start: " + startTime + " End: " + endTime);

        System.out.println("-------------------------- Bubble sort --------------------------------");
        int[] array3 = array.clone();
        if (showInfoAboutArrays){
            System.out.println("Original array:");
            printArray(array3);
        }
        startTime = System.nanoTime();

        sortBubble(array3);

        endTime = System.nanoTime();
        long elapsedTimeBubbleSort = endTime - startTime;
        if (showInfoAboutArrays){
            System.out.println("Sorted array:");
            printArray(array3);
        }
        System.out.println("elapsedTime = " + nanosToMillis(elapsedTimeBubbleSort) + " ms"
                + " Start: " + startTime + " End: " + endTime);

        // Summary

        System.out.println("N = " + n +
                " Selection sort --> " + nanosToMillis(elapsedTimeSelecSort) + " ms. " +
                " Arrays.sort() --> " + nanosToMillis(elapsedTimeArrysSort) + " ms. " +
                " Bubble sort --> " + nanosToMillis(elapsedTimeBubbleSort) + " ms. ");
    }

    public static void main(String[] args) {
        System.out.println("************************ Task1, Sorting arrays *****************************");

        doTheComparisonBetweenSortingMethods(10, false);
        doTheComparisonBetweenSortingMethods(100, false);
        doTheComparisonBetweenSortingMethods(1000, false);
        doTheComparisonBetweenSortingMethods(10000, false);
        doTheComparisonBetweenSortingMethods(100000, false);

        // are you sure?
        // last time it was:
        // N = 1000000 Selection sort --> 361863.247138 ms.  Arrays.sort() --> 99.912451 ms.  Bubble sort --> 1465278.932809 ms.

        // doTheComparisonBetweenSortingMethods(1000000, false);
    }
}
