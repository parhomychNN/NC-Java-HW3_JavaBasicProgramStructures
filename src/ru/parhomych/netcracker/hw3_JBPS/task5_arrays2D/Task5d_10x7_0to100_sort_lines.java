package ru.parhomych.netcracker.hw3_JBPS.task5_arrays2D;

public class Task5d_10x7_0to100_sort_lines {
    public static void main(String[] args) {

        RandomIntegerArray2D randomIntegerArray2D = new RandomIntegerArray2D(10,7,0,100);
        randomIntegerArray2D.print();

        System.out.println();

        System.out.println("Sorted array in descending order:");
        randomIntegerArray2D.sortLinesDescOrder();
        randomIntegerArray2D.print();

    }
}
