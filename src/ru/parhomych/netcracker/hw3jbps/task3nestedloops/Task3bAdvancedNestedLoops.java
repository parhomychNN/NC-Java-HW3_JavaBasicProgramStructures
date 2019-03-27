package ru.parhomych.netcracker.hw3jbps.task3nestedloops;

public class Task3bAdvancedNestedLoops {
    public static void main(String[] args) {
        System.out.println("******************* Task 3b ****************************");
        System.out.println("******************* Advanced nested loops **************");

        int amount = 8;

        System.out.println();
        System.out.println("----- a -----");

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                if (j <= i){
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("----- b -----");

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                if (i <= j){
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("----- c -----");

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                if (j < i){
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("----- d -----");

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                if (i >= amount - 1 - j){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        amount = 7;

        System.out.println("----- e -----");

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                if (i == 0 || i == (amount - 1) || j == 0 || j == amount - 1){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("----- f -----");

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                if (i == 0 || i == (amount - 1) || j == i){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("----- g -----");

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                if (i == 0 || i == (amount - 1) || j == (amount - 1 - i)){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("----- h -----");

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                if (i == 0 || i == (amount - 1) || j == (amount - 1 - i) || i == j){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("----- i -----");

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                if (i == 0 || i == (amount - 1) || j == (amount - 1 - i) || i == j || j == 0 || j == amount - 1){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



    }
}
