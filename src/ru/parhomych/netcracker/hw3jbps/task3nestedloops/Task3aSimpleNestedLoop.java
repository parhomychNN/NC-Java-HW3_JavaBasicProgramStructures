package ru.parhomych.netcracker.hw3jbps.task3nestedloops;

public class Task3aSimpleNestedLoop {
    public static void main(String[] args) {
        System.out.println("******************* Task 3a ****************************");
        System.out.println("******************* Simple nested loops ****************");
        int amount = 5;
        for (int i = 0; i < amount; i++){
            for (int j = 0; j < amount; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
