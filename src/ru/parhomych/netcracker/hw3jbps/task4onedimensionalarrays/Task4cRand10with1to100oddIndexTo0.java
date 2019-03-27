package ru.parhomych.netcracker.hw3jbps.task4onedimensionalarrays;

import java.util.Random;

public class Task4cRand10with1to100oddIndexTo0 {
    public static void main(String[] args) {
        System.out.println("************ Creating an array filled by 10 random numbers [1; 100] *************");
        System.out.println("************ then numbers with odd index --> to 0 *******************************");
        int[] randArray = new int[10];
        Random rand = new Random(10);

        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Random array is:");

        for (int i = 0; i < randArray.length; i++) {
            System.out.print(randArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < randArray.length; i++) {
            if (i % 2 != 0){
                randArray[i] = 0;
            }
        }

        System.out.println("Killing odd-indexed numbers...");

        for (int i = 0; i < randArray.length; i++) {
            System.out.print(randArray[i] + " ");
        }
    }
}
