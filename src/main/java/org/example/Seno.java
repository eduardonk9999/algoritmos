package org.example;

import java.util.Scanner;

public class Seno {
    public static void main(String[] args) {
//        função seno_do_angulo(a, b, c):
//         Calcula o cosseno do ângulo C
//        cos_C = (a^2 + b^2 - c^2) / (2 * a * b)
//
//        Calcula o seno do ângulo C
//        sen_C = raiz_quadrada(1 - cos_C^2)
//
//        retornar sen_C


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numDois = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numTres = scanner.nextInt();

        Seno(numUm, numDois, numTres);

    }

    public static void Seno(double numUm, double numDois, double numTres) {
        // cos_C = (a^2 + b^2 - c^2) / (2 * a * b)
        // java double cos_C = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);

        double senoAngulo = (Math.pow(numUm, 2) + Math.pow(numDois, 2) - Math.pow(numTres, 2)) / (2 * numUm * numDois);

        System.out.println(senoAngulo);

    };
}
