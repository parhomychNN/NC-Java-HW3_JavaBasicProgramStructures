package ru.parhomych.netcracker.hw3jbps.task5arrays2d;

public class Task5d10x7with0to100sortLines {
    public static void main(String[] args) {

        RandomIntegerArray2D randomIntegerArray2D = new RandomIntegerArray2D(10,7,0,100);
        randomIntegerArray2D.print();

        System.out.println();

        System.out.println("Sorted array in descending order:");
        randomIntegerArray2D.sortLinesDescOrder();
        randomIntegerArray2D.print();

    }
}
