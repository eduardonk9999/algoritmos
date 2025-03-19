package org.example;

public class FibonacciInterativo {
    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c;

        for(int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci de " + n + " é: " + fibonacci(n));
    }
}
