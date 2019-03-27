package ru.parhomych.netcracker.hw3jbps.task5arrays2d;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomIntegerArray2D {

    private int[][] array2D;

    public RandomIntegerArray2D(int x, int y, int loBound, int hiBound) {
        array2D = new int[x][y];
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array2D[i][j] = Math.toIntExact(Math.round((random.nextDouble() * (hiBound - loBound)) + loBound));
            }
        }
    }

    public void print(){
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void whatLineMultIsMax(){
        int[] multLinesAbsArray = new int[array2D.length];

        for (int i = 0; i < array2D.length; i++) {
            int multLine = 1;
            for (int j = 0; j < array2D[0].length; j++) {
                multLine *= array2D[i][j];
            }
            multLinesAbsArray[i] = Math.abs(multLine);
        }

        int maxLineAbsMult = multLinesAbsArray[0];
        int maxLineAbsMultIndex = -1;

        for (int i = 0; i < multLinesAbsArray.length; i++) {
            System.out.println("Multiplication (in absolute value) of elements in line " + i + " --> " + multLinesAbsArray[i]);
            if (multLinesAbsArray[i] > maxLineAbsMult){
                maxLineAbsMult = multLinesAbsArray[i];
                maxLineAbsMultIndex = i;
            }
        }

        System.out.println("Max multLine abs value --> " + maxLineAbsMult);
        System.out.println("Line with max multLine abs value --> " + maxLineAbsMultIndex);
    }

    public void sortLinesDescOrder(){
        Integer[] line = new Integer[array2D[0].length];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                line[j]= array2D[i][j];
            }
            Arrays.sort(line, Collections.reverseOrder());
            for (int j = 0; j < line.length; j++) {
                array2D[i][j] = line[j];
            }
        }


    }
}
