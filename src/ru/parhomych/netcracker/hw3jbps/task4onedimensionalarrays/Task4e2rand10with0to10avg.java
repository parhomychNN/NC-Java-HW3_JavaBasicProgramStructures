package ru.parhomych.netcracker.hw3jbps.task4onedimensionalarrays;

import java.util.Random;

public class Task4e2rand10with0to10avg {

    public static void printArray(int[] arr, String name){
        System.out.println("Random array " + name +" [0;10] is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }
    }

    public static double avgValueOfArray(int[] arr){
        double summ = 0;
        double avg = 0;

        for (int num : arr) {
            summ += num;
        }

        avg = summ / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("************ Creating 2 arrays filled by 10 random numbers [0;10]*************");
        System.out.println("************ then calculating avg, etc ********************" +
                "*******************");
        int[] randArray1 = new int[10];
        int[] randArray2 = new int[10];

        fillArray(randArray1);
        fillArray(randArray2);

        printArray(randArray1, "#1");
        printArray(randArray2, "#2");

        double avg1 = avgValueOfArray(randArray1);
        double avg2 = avgValueOfArray(randArray2);

        System.out.println("Average num in array #1 --> " + avg1);
        System.out.println("Average num in array #2 --> " + avg2);

        if (avg1 < avg2){
            System.out.println("Avg of array #1 < Avg of array #2");
        } else if (avg1 == avg2){
            System.out.println("Avg of array #1 = Avg of array #2");
        } else {
            System.out.println("Avg of array #1 > Avg of array #2");
        }

    }
}
