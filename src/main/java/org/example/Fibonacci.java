package org.example;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci(10);
    }

    public void fibonacci(int n) {
        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++) {
            System.out.println(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
