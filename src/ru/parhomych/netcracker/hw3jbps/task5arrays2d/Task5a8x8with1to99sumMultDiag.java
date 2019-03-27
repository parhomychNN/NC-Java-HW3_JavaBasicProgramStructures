package ru.parhomych.netcracker.hw3jbps.task5arrays2d;

import java.math.BigDecimal;

public class Task5a8x8with1to99sumMultDiag {
    public static void main(String[] args) {

        RandomDoubleArray2D randomDoubleArray2D = new RandomDoubleArray2D(8,8,1,99);
        randomDoubleArray2D.print();

        System.out.println("Sum of main diagonal --> " + randomDoubleArray2D.sumDiag(true));
        System.out.println("Sum of side diagonal --> " + randomDoubleArray2D.sumDiag(false));

        System.out.println("Mult of main diagonal --> " +
                BigDecimal.valueOf(randomDoubleArray2D.multDiag(true)));
        System.out.println("Mult of side diagonal --> " +
                BigDecimal.valueOf(randomDoubleArray2D.multDiag(false)));

        System.out.println();
    }
}
