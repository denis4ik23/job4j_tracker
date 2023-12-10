package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int multiply(int a) {
        return a * x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + minus(c) + divide(c) + multiply(c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("summa: " + calculator.sumAllOperation(10));
    }
}
