package ru.parhomych.netcracker.hw3_JBPS.task5_arrays2D;

public class Task5c_8x5_neg10to10_mult_line_max_index {
    public static void main(String[] args) {

        RandomIntegerArray2D randomIntegerArray2D = new RandomIntegerArray2D(8,5,-10,10);
        randomIntegerArray2D.print();

        randomIntegerArray2D.whatLineMultIsMax();

    }
}
