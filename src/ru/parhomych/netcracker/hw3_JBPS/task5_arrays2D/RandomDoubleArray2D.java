package ru.parhomych.netcracker.hw3_JBPS.task5_arrays2D;

import java.util.Random;

public class RandomDoubleArray2D {

    private double[][] array2D;

    public RandomDoubleArray2D(int x, int y, double loBound, double hiBound) {
        array2D = new double[x][y];
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array2D[i][j] = Math.round(((random.nextDouble() * (hiBound - loBound)) + loBound) * 1000) / 1000.00;
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

    public double sumDiag(boolean ofMainDiag){
        double sum = 0;
        if (ofMainDiag){
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[0].length; j++) {
                    if (i == j){
                        sum += array2D[i][j];
                    }
                }
            }
        } else {
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[0].length; j++) {
                    if (j == array2D.length - i){
                        sum += array2D[i][j];
                    }
                }
            }
        }
        return sum;
    }

    public double multDiag(boolean ofMainDiag){
        double mult = 1;
        if (ofMainDiag){
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[0].length; j++) {
                    if (i == j){
                        mult *= array2D[i][j];
                    }
                }
            }
        } else {
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[0].length; j++) {
                    if (j == array2D.length - i){
                        mult *= array2D[i][j];
                    }
                }
            }
        }
        return mult;
    }

    public void printWhatElemIsMax(){
        double max = array2D[0][0];
        int indexLine = 0;
        int indexColimn = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                if (max < array2D[i][j]){
                    max = array2D[i][j];
                    indexLine = i;
                    indexColimn = j;
                }
            }
        }

        System.out.println("Max element --> " + max);
        System.out.println("Line --> " + indexLine + " column --> " + indexColimn);

    }

}
