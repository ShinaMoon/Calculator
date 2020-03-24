package com.example.Calculator;

public class Calculator {

    public static String buffer = "";
    public static String bufferOperation = "";

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
       return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int procent(int a, int b) {
        return ((a / 100) * b);
    }
}
