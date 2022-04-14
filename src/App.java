package com.company;
public class App {
    int num1;
    int num2;

    private static int sum2Numbers(int num1, int num2) {
        return num1 + num2;
    }

    private static int sum3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    private static int computeSum(int num1, int num2) {
        return num1 + num2;
    }

    private static int computeSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Computing two numbers 10 and 20 = " + App.sum2Numbers(10, 20));
        System.out.println("Computing three numbers 10 and 20 and 30 = " + App.sum3Numbers(10, 20, 30));
        System.out.println("=================================");
        System.out.println("Computing two numbers 20 and 30 = " + App.computeSum(20, 30));
        System.out.println("Computing three numbers 20 and 30 and 40 = " + App.computeSum(20, 30, 40));

        Pen p1 = new Pen("Faber-Castell");
        Pen p2 = new Pen(2);
    }
}