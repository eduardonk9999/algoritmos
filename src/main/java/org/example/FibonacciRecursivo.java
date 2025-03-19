package org.example;

public class FibonacciRecursivo {
   public static int fibonacci(int n) {
       if (n <= 1) {
           return n;
       }
       return fibonacci(n - 1) + fibonacci(n - 2);
   }

   public static void main(String[] args) {
       int n = 20;
       System.out.println("Fibonacci de " + n + " é " + fibonacci(n));
   }
}
