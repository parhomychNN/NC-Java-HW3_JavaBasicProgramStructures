package ru.parhomych.netcracker.hw3_JBPS.task5_arrays2D;

import java.math.BigDecimal;

public class Task5b_8x5_neg99to99_max_elem_index {
    public static void main(String[] args) {

        RandomDoubleArray2D randomDoubleArray2D = new RandomDoubleArray2D(8,5,-99,99);
        randomDoubleArray2D.print();

        randomDoubleArray2D.printWhatElemIsMax();
    }
}
