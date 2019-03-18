package ru.parhomych.netcracker.hw3_JBPS.task6_elseIf_switchCase;

import ru.parhomych.netcracker.hw3_JBPS.task5_arrays2D.RandomIntegerArray2D;

import java.util.Random;

public class Array50_0to10_ElseIfSwitchCaseTestDrive {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random random = new Random();

        System.out.print("Array is: ");
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(11);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] countNumbersInArray = new int[11];

        System.out.println("Numbers in array are: ");
        long startTime = System.nanoTime();
        for(int i = 0; i < array.length; i++){
            switch (array[i]){
                case 0:
                    System.out.print("Ноль | ");
                    countNumbersInArray[array[i]]++;
                    break;
                case 1:
                    System.out.print("Один | ");
                    countNumbersInArray[array[i]]++;
                    break;
                case 2:
                    System.out.print("Два | ");
                    countNumbersInArray[array[i]]++;
                    break;
                case 3:
                    System.out.print("Три | ");
                    countNumbersInArray[array[i]]++;
                    break;
                case 4:
                    System.out.print("Четыре | ");
                    countNumbersInArray[array[i]]++;
                    break;
                case 5:
                    System.out.print("Пять | ");
                    countNumbersInArray[array[i]]++;
                    break;
                case 6:
                    System.out.print("Шесть | ");
                    countNumbersInArray[array[i]]++;
                    break;
                case 7:
                    System.out.print("Семь | ");
                    countNumbersInArray[array[i]]++;
                    break;
                case 8:
                    System.out.print("Восемь | ");
                    countNumbersInArray[array[i]]++;
                    break;
                case 9:
                    System.out.print("Девять | ");
                    countNumbersInArray[array[i]]++;
                    break;
                case 10:
                    System.out.print("Деcять | ");
                    countNumbersInArray[array[i]]++;
                    break;
            }
        }
        long endTime = System.nanoTime();
        long switchTime = endTime - startTime;

        startTime = System.nanoTime();
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                System.out.print ("Нолик | ");
            } else if (array[i] == 1){
                System.out.print ("Единичка | ");
            } else if (array[i] == 2){
                System.out.print ("Двоечка | ");
            } else if (array[i] == 3){
                System.out.print ("Троечка | ");
            } else if (array[i] == 4){
                System.out.print ("Четверочка | ");
            } else if (array[i] == 5){
                System.out.print ("Пятерочка | ");
            } else if (array[i] == 6){
                System.out.print ("Шестерка | ");
            } else if (array[i] == 7){
                System.out.print ("Семерка | ");
            } else if (array[i] == 8){
                System.out.print ("Восьмерка | ");
            } else if (array[i] == 9){
                System.out.print ("Девятка | ");
            } else if (array[i] == 10){
                System.out.print ("Десятка | ");
            }
        }
        endTime = System.nanoTime();
        long elseIfTime = endTime - startTime;

        System.out.println();
        System.out.println("Time of switch-case in array --> " + switchTime + " nanoseconds");
        System.out.println("Time of if else in array --> " + elseIfTime + " nanoseconds");

        for (int i = 0; i < countNumbersInArray.length; i++) {
            System.out.println(i + " --> " + countNumbersInArray[i] + " шт.");
        }
    }
}
