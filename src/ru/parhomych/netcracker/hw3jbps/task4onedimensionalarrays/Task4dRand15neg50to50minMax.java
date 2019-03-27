package ru.parhomych.netcracker.hw3jbps.task4onedimensionalarrays;

import java.util.Random;

public class Task4dRand15neg50to50minMax {
    public static void main(String[] args) {
        System.out.println("************ Creating an array filled by 15 random numbers [-50;50]*************");
        System.out.println("************ then finding min & max and show their indexes *********************");
        int[] randArray = new int[15];
        Random random = new Random();

        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = random.nextInt(101) - 50;
        }

        System.out.println("Random array [-50;50] is:");

        for (int i = 0; i < randArray.length; i++) {
            System.out.print(randArray[i] + " ");
        }
        System.out.println();

        // looking for min and max
        int min = 0, max = 0, minIndex = 0, maxIndex = 0;
        for (int i = 0; i < randArray.length; i++) {
            if (randArray[i] > max){
                max = randArray[i];
                maxIndex = i;
            }
            if (randArray[i] < min){
                min = randArray[i];
                minIndex = i;
            }
        }

        System.out.println("min --> " + min + " max --> " + max);
        System.out.println("minIndex --> " + minIndex + " maxIndex --> " + maxIndex);
    }
}
