package ru.parhomych.netcracker.hw3jbps.task4onedimensionalarrays;

public class Task4a1odd99 {
    public static void main(String[] args) {

        System.out.println("************** Creating array filled by odd numbers (1 to 99) *************");
        int[] arrayOdd = new int[50];
        int index = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            arrayOdd[index] = i;
            index++;
        }

        System.out.println("In ascending order:");
        for (int i = 0; i < arrayOdd.length; i++){
            System.out.print(arrayOdd[i] + " ");
        }

        System.out.println();

        System.out.println("In descending order:");
        for (int i = arrayOdd.length - 1; i >= 0; i--){
            System.out.print(arrayOdd[i] + " ");
        }
    }
}
