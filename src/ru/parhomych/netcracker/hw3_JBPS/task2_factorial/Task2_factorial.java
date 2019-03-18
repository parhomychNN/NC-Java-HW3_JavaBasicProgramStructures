package ru.parhomych.netcracker.hw3_JBPS.task2_factorial;

public class Task2_factorial {

    public static long factorialLoop(int n){
        long factorial = 1;
        if (n < 0){
            System.out.println("Go away! Uchi matchast!");
            return -1;
        }
        if (n == 0){
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long factorialRecursion(int n){
        long result = 1;
        if (n < 0){
            System.out.println("Go away! Uchi matchast!");
            return -1;
        }
        if (n == 1 || n == 0){
            return result;
        }
        result = n * factorialRecursion(n-1);
        return result;
    }

    public static void doComparisonBetweenFactorialCalc(int n){
        long startTime = System.nanoTime();
        long factorialLoop = factorialLoop(n);
        long endTime = System.nanoTime();
        long estimatedTime = endTime - startTime;

        System.out.println(n + "! (Loop) = " + factorialLoop + " --> " + estimatedTime + " nanoseconds");

        startTime = System.nanoTime();
        long factorialRecursion = factorialRecursion(n);
        endTime = System.nanoTime();
        estimatedTime = endTime - startTime;
        System.out.println(n + "! (Recursion) = " + factorialRecursion + " --> " + estimatedTime + " nanoseconds");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("***************** Factorial ********************");
        doComparisonBetweenFactorialCalc(0);
        doComparisonBetweenFactorialCalc(1);
        doComparisonBetweenFactorialCalc(5);
        doComparisonBetweenFactorialCalc(10);
        doComparisonBetweenFactorialCalc(20);
        doComparisonBetweenFactorialCalc(25);
    }
}
