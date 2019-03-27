package ru.parhomych.netcracker.hw3jbps.task4onedimensionalarrays;

import java.util.ArrayList;
import java.util.Random;

public class Task4fRand20neg1to1freq {

    public static void printArray(int[] arr){
        System.out.println("Random array [-1;1] is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(3) - 1;
        }
    }

    public static ArrayList<Integer> getMostCommonElements(int[] arr){
        int[] amounts = new int[3];
        ArrayList<Integer> maxElements = new ArrayList<>();
        // creating an array for counting (amounts[0] is for -1, amounts[1] is for 0, amounts[2] is for 1)
        for (int num : arr) {
            amounts[num + 1]++;
        }
        int maxAmount = 0;

        for (int i = 0; i < amounts.length; i++) {
            if (maxAmount < amounts[i]){
                maxAmount = amounts[i];
            }
        }
        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] == maxAmount){
                maxElements.add(i - 1);
            }
        }
        return maxElements;
    }

    public static void main(String[] args) {
        System.out.println("************ Creating array filled by 20 random numbers [-1;1]*************");
        System.out.println("************ then calculating amount of -1, 0, 1 *******************" +
                "*******");
        int[] randArray = new int[20];

        fillArray(randArray);
        printArray(randArray);

        int[] amounts = new int[3];
        for (int num : randArray) {
                amounts[num + 1]++;
        }
        System.out.println("-1 -> " + amounts[0] + " шт.");
        System.out.println("0 --> " + amounts[1] + " шт.");
        System.out.println("1 --> " + amounts[2] + " шт.");

        ArrayList mostCommonElements = getMostCommonElements(randArray);

        System.out.print("Elements that repeated most often: ==> ");

        for (int i = 0; i < mostCommonElements.size(); i++) {
            System.out.print(mostCommonElements.get(i) + " ");
        }

    }
}
