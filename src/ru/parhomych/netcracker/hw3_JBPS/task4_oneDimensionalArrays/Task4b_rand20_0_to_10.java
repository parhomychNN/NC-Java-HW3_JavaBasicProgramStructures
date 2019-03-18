package ru.parhomych.netcracker.hw3_JBPS.task4_oneDimensionalArrays;

public class Task4b_rand20_0_to_10 {
    public static void main(String[] args) {
        System.out.println("************ Creating an array filled by 20 random numbers *************");
        int[] randArray = new int[20];

        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int)(Math.floor(Math.random() * 11));
        }

        System.out.println("Random array is:");

        for (int i = 0; i < randArray.length; i++) {
            System.out.print(randArray[i] + " ");
        }

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < randArray.length; i++) {
            if (randArray[i] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println();

        System.out.println("Amount of odd numbers --> " + oddCount);
        System.out.println("Amount of even numbers --> " + evenCount);
    }
}
