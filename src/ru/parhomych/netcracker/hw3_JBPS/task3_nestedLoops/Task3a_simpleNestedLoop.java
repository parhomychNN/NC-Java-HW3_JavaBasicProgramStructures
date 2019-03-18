package ru.parhomych.netcracker.hw3_JBPS.task3_nestedLoops;

public class Task3a_simpleNestedLoop {
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
